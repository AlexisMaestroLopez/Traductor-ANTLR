import org.antlr.v4.runtime.*;
import java.util.ArrayList;
import java.util.List;

public class ErrorListener extends BaseErrorListener {

    private final String fase;                         // "léxico" o "sintáctico"
    private final List<String> errores = new ArrayList<>();

    public ErrorListener(String fase) {
        this.fase = fase;
    }

    // ----------------------------------------------------------------
    // API pública
    // ----------------------------------------------------------------

    /** True si se detectó al menos un error. */
    public boolean hayErrores() {
        return !errores.isEmpty();
    }

    /** Lista completa de mensajes acumulados (para imprimirlos todos al final). */
    public List<String> getErrores() {
        return errores;
    }

    // ----------------------------------------------------------------
    // Callback ANTLR — se invoca UNA VEZ por cada error encontrado.
    // Al NO lanzar excepción, ANTLR aplica su DefaultErrorStrategy
    // (single-token deletion / insertion) y CONTINÚA el análisis.
    // ----------------------------------------------------------------

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        // ANTLR devuelve columna base-0 → la convertimos a base-1
        int columna = charPositionInLine + 1;

        String descripcion = traducirMensaje(msg, offendingSymbol, e);

        String error = String.format("[Error %s] Línea %d, columna %d: %s",
                fase, line, columna, descripcion);

        errores.add(error);
        System.err.println(error);   // feedback inmediato en stderr
    }

    // ----------------------------------------------------------------
    // Traducción y enriquecimiento del mensaje de ANTLR
    // ----------------------------------------------------------------

    private String traducirMensaje(String msg,
                                   Object simbolo,
                                   RecognitionException e) {
        if (msg == null) return "error desconocido.";

        String tok = extraerToken(simbolo);

        // ── "mismatched input 'x' expecting {…}" ────────────────────
        if (msg.startsWith("mismatched input")) {
            String esperado = extraerEsperado(msg);
            return "token inesperado " + tok + ". Se esperaba: " + esperado + "."
                    + causaProbable(tok, esperado, msg);
        }

        // ── "no viable alternative at input 'x'" ────────────────────
        if (msg.startsWith("no viable alternative")) {
            return "token inesperado " + tok
                    + ": no existe ninguna alternativa válida en este punto del programa. "
                    + "Posible causa: la sentencia o declaración anterior está incompleta o mal formada.";
        }

        // ── "extraneous input 'x' expecting {…}" ────────────────────
        if (msg.startsWith("extraneous input")) {
            String esperado = extraerEsperado(msg);
            return "token sobrante " + tok + ". Se esperaba: " + esperado + ". "
                    + "Posible causa: símbolo duplicado o ';' de más.";
        }

        // ── "missing 'x' at 'y'" ────────────────────────────────────
        if (msg.startsWith("missing")) {
            // Extraemos qué falta: todo lo que hay entre "missing " y " at"
            String falta = msg.replaceFirst("(?i)missing\\s+", "")
                              .replaceFirst("\\s+at\\b.*", "")
                              .trim();
            return "falta " + falta + " antes de " + tok + ". "
                    + "Posible causa: declaración o sentencia incompleta.";
        }

        // ── Mensaje genérico (token recognition error, etc.) ────────
        return msg;
    }

    /**
     * Genera una pista sobre la causa probable a partir del token
     * ofensivo y de lo que se esperaba.
     */
    private String causaProbable(String tok, String esperado, String msg) {
        // Fin de fichero inesperado
        if (tok.equals("'<EOF>'")) {
            return " El fichero terminó de forma inesperada: "
                    + "probablemente falta cerrar un bloque (END PROGRAM, END FUNCTION, ENDIF, ENDDO…).";
        }
        // Falta punto y coma
        if (esperado.contains("';'")) {
            return " Posible causa: falta ';' al final de la sentencia anterior.";
        }
        // Paréntesis sin cerrar
        if (esperado.contains("')'")) {
            return " Posible causa: paréntesis sin cerrar.";
        }
        // Paréntesis sin abrir
        if (esperado.contains("'('")) {
            return " Posible causa: falta '(' en la llamada, condición o cabecera.";
        }
        // Falta END de bloque
        if (esperado.contains("'END'") || esperado.contains("ENDIF")
                || esperado.contains("ENDDO") || esperado.contains("END")) {
            return " Posible causa: bloque sin cerrar.";
        }
        // Falta '::'
        if (esperado.contains("'::'")) {
            return " Posible causa: falta '::' en la declaración de variables.";
        }
        // Falta '='
        if (esperado.contains("'='")) {
            return " Posible causa: falta '=' en la asignación o inicialización.";
        }
        return "";
    }

    // ----------------------------------------------------------------
    // Utilidades
    // ----------------------------------------------------------------

    private String extraerToken(Object simbolo) {
        if (simbolo instanceof Token) {
            Token t = (Token) simbolo;
            String txt = t.getText();
            // EOF lo mostramos de forma más legible
            if (txt.equals("<EOF>")) return "'<EOF>' (fin de fichero)";
            return "'" + txt + "'";
        }
        return "(token desconocido)";
    }

    private String extraerEsperado(String msg) {
        // ANTLR pone el conjunto esperado entre llaves: {';', 'END', …}
        int inicio = msg.indexOf('{');
        int fin    = msg.lastIndexOf('}');
        if (inicio >= 0 && fin > inicio) {
            return msg.substring(inicio, fin + 1);
        }
        // Si no hay llaves, tomamos la última palabra
        int espacio = msg.lastIndexOf(' ');
        return espacio >= 0 ? msg.substring(espacio + 1) : msg;
    }
}