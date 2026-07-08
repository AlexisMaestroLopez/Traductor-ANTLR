import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

public class Main {
 
    public static void main(String[] args) throws Exception {
 
        if (args.length < 1) {
            System.err.println("Uso: java -jar miPrograma.jar <fichero.for>");
            System.exit(1);
        }
 
        String rutaEntrada = args[0];
        File ficheroEntrada = new File(rutaEntrada);
        if (!ficheroEntrada.exists()) {
            System.err.println("Error: no se encuentra el fichero '" + rutaEntrada + "'");
            System.exit(1);
        }
 
        // Nombre del fichero de salida: mismo nombre, extension.c
        String nombreBase   = ficheroEntrada.getName();
        int    punto        = nombreBase.lastIndexOf('.');
        String nombreSinExt = (punto >= 0) ? nombreBase.substring(0, punto) : nombreBase;
        String rutaSalida   = (ficheroEntrada.getParent() != null
                ? ficheroEntrada.getParent() + File.separator
                : "") + nombreSinExt + ".c";
 
        // Un listener por fase — acumulan errores sin lanzar excepcion
        // La fase se pasa como string ASCII para evitar problemas de encoding
        ErrorListener errorLex = new ErrorListener("l\u00e9xico");
        ErrorListener errorSin = new ErrorListener("sint\u00e1ctico");
 
        // Redirigimos System.out a un buffer en memoria.
        // Solo volcamos al disco si no hubo errores.
        ByteArrayOutputStream buffer     = new ByteArrayOutputStream();
        PrintStream           bufStream  = new PrintStream(buffer, true, "UTF-8");
        PrintStream           stdoutOrig = System.out;
        System.setOut(bufStream);
 
        boolean errorSemantico = false;
 
        try {
            CharStream input = CharStreams.fromFileName(rutaEntrada);
 
            gramaticaLexer lexer = new gramaticaLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorLex);
 
            CommonTokenStream tokens = new CommonTokenStream(lexer);
 
            gramaticaParser parser = new gramaticaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorSin);
            // DefaultErrorStrategy: single-token deletion/insertion → el parser CONTINUA
            parser.setErrorHandler(new DefaultErrorStrategy());
 
            parser.programa();
 
        } catch (RuntimeException e) {
            // Errores semanticos lanzados desde las acciones de la gramatica
            errorSemantico = true;
            System.err.println("[Error sem\u00e1ntico]: " + e.getMessage());
 
        } finally {
            bufStream.flush();
            System.setOut(stdoutOrig);
        }
 
        boolean hayErrores = errorLex.hayErrores()
                          || errorSin.hayErrores()
                          || errorSemantico;
 
        if (!hayErrores) {
            try (FileOutputStream fos = new FileOutputStream(rutaSalida)) {
                buffer.writeTo(fos);
            }
            System.out.println("Traducci\u00f3n completada: " + rutaSalida);
        } else {
            new File(rutaSalida).delete();
            int total = errorLex.getErrores().size() + errorSin.getErrores().size()
                      + (errorSemantico ? 1 : 0);
            System.err.println("\nSe encontraron " + total
                    + " error(es). No se ha generado fichero de salida.");
            System.exit(1);
        }
    }
}