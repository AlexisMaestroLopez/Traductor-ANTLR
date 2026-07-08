public class Parametro {

    public String  tipo;
    public String  nombre;
    public boolean esPorRef;
    public boolean esCadena;

    public Parametro(String tipo, String nombre, boolean esPorRef) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.esPorRef = esPorRef;
        this.esCadena = (tipo != null && tipo.startsWith("char"));
    }

    public String toDeclaracionC() {
        if (tipo == null) return nombre;

        // Cualquier tipo char en parámetro genera "char nombre[]"
        // (con longitud: "char[n]" -> ya incluye corchetes; sin longitud: "char" -> añadir [])
        if (tipo.startsWith("char")) {
            if (esPorRef) {
                return "char *" + nombre + "[]";
            }
            return "char " + nombre + "[]";
        }

        if (esPorRef) {
            return tipo + " *" + nombre;
        }
        return tipo + " " + nombre;
    }

    @Override
    public String toString() {
        return toDeclaracionC();
    }
}