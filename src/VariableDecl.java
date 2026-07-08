public class VariableDecl {

    public String tipo;
    public String nombre;
    private int dimension = -1;
    private String valorInicial = null;

    public VariableDecl(String tipo, String nombre) {
        this.tipo   = tipo;
        this.nombre = nombre;
    }

    public void setDimension(int d)   { this.dimension    = d; }
    public void setInit(String valor) { this.valorInicial = valor; }

    public String toDeclaradorC() {
        StringBuilder sb = new StringBuilder(nombre);
        if (dimension > 0)
            sb.append("[").append(dimension).append("]");
        if (valorInicial != null)
            sb.append(" = ").append(valorInicial);
        return sb.toString();
    }

    public String toDeclaracionCompletaC() {
        return tipo + " " + toDeclaradorC() + ";";
    }
}