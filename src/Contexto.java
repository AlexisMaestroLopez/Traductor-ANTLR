import java.util.*;

public class Contexto {

    private enum TipoAmbito { GLOBAL, MAIN, FUNCION, PROCEDIMIENTO }

    private TipoAmbito tipoActual = TipoAmbito.GLOBAL;
    private String nombreActual = null;
    private String tipoRetorno = null;

    private Set<String> paramsPorRef = new HashSet<>();

    public void entrarMain() {
        tipoActual = TipoAmbito.MAIN;
        nombreActual = "main";
        tipoRetorno = null;
        paramsPorRef = new HashSet<>();
    }

    public void entrarFuncion(String nombre, String tipoRet) {
        tipoActual = TipoAmbito.FUNCION;
        nombreActual = nombre;
        tipoRetorno = tipoRet;
        paramsPorRef = new HashSet<>();
    }

    public void entrarProcedimiento(String nombre) {
        tipoActual = TipoAmbito.PROCEDIMIENTO;
        nombreActual = nombre;
        tipoRetorno = null;
        paramsPorRef = new HashSet<>();
    }

    public void registrarParamPorRef(String nombre) {
        paramsPorRef.add(nombre);
    }

    public void salir() {
        tipoActual = TipoAmbito.GLOBAL;
        nombreActual = null;
        tipoRetorno = null;
        paramsPorRef = new HashSet<>();
    }

    public boolean esAsignacionDeRetorno(String nombre) {
        return tipoActual == TipoAmbito.FUNCION
            && nombre.equals(nombreActual);
    }

    public boolean esPorReferencia(String nombre) {
        return paramsPorRef.contains(nombre);
    }

    public String getNombreActual() { return nombreActual; }
    public String getTipoRetorno() { return tipoRetorno;  }
    public boolean estaEnMain() { return tipoActual == TipoAmbito.MAIN; }
    public boolean estaEnFuncion() { return tipoActual == TipoAmbito.FUNCION; }
}
