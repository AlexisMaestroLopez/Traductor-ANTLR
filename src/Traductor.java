import java.util.*;

public class Traductor {

    private final Contexto contexto = new Contexto();
    private final List<String> defines = new ArrayList<>();
    private final List<String> cabeceras = new ArrayList<>();
    private final List<String> implementaciones = new ArrayList<>();
    
    private String codigoMain = null;
    private List<VariableDecl> varsMain = null;

    public Contexto getContexto() { return contexto; }

    public void addDefine(String nombre, String valor) {
        defines.add("#define " + nombre + " " + valor);
    }

    public void addDecFun(String tipoRet, String nombre, List<Parametro> params) {
        StringBuilder sb = new StringBuilder();
        sb.append(tipoRet).append(" ").append(nombre).append("(");
        if (params.isEmpty()) {
            sb.append("void");
        } else {
            for (int i = 0; i < params.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(params.get(i).toDeclaracionC());
            }
        }
        sb.append(");");
        cabeceras.add(sb.toString());
    }

    public void addProcedimiento(String nombre, List<Parametro> params,
                                  List<VariableDecl> vars, String codigoCuerpo) {
        implementaciones.add(construirFuncion("void", nombre, params, vars, codigoCuerpo));
    }

    public void addFuncion(String nombre, String tipoRet, List<Parametro> params,
                            List<VariableDecl> vars, String codigoCuerpo) {
        implementaciones.add(construirFuncion(tipoRet, nombre, params, vars, codigoCuerpo));
    }

    public void generarMain(List<VariableDecl> vars, String codigo) {
        this.varsMain   = vars;
        this.codigoMain = codigo;
    }

    public String generarPrograma() {
        StringBuilder sb = new StringBuilder();

        for (String d : defines)
            sb.append(d).append("\n");
        if (!defines.isEmpty()) sb.append("\n");

        for (String c : cabeceras)
            sb.append(c).append("\n");
        if (!cabeceras.isEmpty()) sb.append("\n");

        for (String impl : implementaciones)
            sb.append(impl).append("\n");

        if (codigoMain != null) {
            String cuerpo = construirCuerpo(varsMain, codigoMain);
            sb.append("void main(void)").append(" {\n");
            sb.append(indent(cuerpo));
            sb.append("}\n");
        }

        return limpiarBlancos(sb.toString());
    }

    private String construirFuncion(String tipoRet, String nombre,
                                     List<Parametro> params,
                                     List<VariableDecl> vars,
                                     String codigoCuerpo) {
        StringBuilder sb = new StringBuilder();
        sb.append(tipoRet).append(" ").append(nombre).append("(");
        if (params.isEmpty()) {
            sb.append("void");
        } else {
            for (int i = 0; i < params.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(params.get(i).toDeclaracionC());
            }
        }
        sb.append(") {\n");
        sb.append(indent(construirCuerpo(vars, codigoCuerpo)));
        sb.append("}\n");
        return sb.toString();
    }

    private String construirCuerpo(List<VariableDecl> vars, String sentencias) {
        StringBuilder sb = new StringBuilder();

        if (vars != null && !vars.isEmpty()) {
            Map<String, List<VariableDecl>> porTipo = new LinkedHashMap<>();
            for (VariableDecl v : vars) {
                porTipo.computeIfAbsent(v.tipo, k -> new ArrayList<>()).add(v);
            }
            for (Map.Entry<String, List<VariableDecl>> e : porTipo.entrySet()) {
                sb.append(e.getKey()).append(" ");
                List<VariableDecl> grupo = e.getValue();
                for (int i = 0; i < grupo.size(); i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(grupo.get(i).toDeclaradorC());
                }
                sb.append(";\n");
            }
            if (!sentencias.isEmpty()) sb.append("\n");
        }

        if (!sentencias.isEmpty()) sb.append(sentencias);
        return sb.toString().replaceAll("\n{3,}", "\n\n").stripTrailing() + "\n";
    }

    public String indent(String codigo) {
        if (codigo == null || codigo.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        String[] lineas = codigo.split("\n", -1);
        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i];
            // Skip last empty line to avoid blank line before }
            boolean esUltimaVacia = (i == lineas.length - 1) && linea.isEmpty();
            if (esUltimaVacia) break;
            if (!linea.isEmpty())
                sb.append("    ").append(linea);
            sb.append("\n");
        }
        // Junta dos líneas en blanco en una
        return sb.toString().replaceAll("\n{3,}", "\n\n");
    }

    /** Removes consecutive blank lines (keeps max one). */
    public static String limpiarBlancos(String s) {
        return s.replaceAll("(\n\s*){3,}", "\n\n");
    }
}