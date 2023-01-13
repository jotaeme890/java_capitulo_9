public class Incidencia {
    private int codigo;
    private String estado;
    private int puesto;
    private String problema;
    private String solucion;
    private static int contadorCodigos = 1;
    private static int pendientes = 0;

    public Incidencia(int puesto, String problema) {
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "Pendiente";
        this.codigo = contadorCodigos++;
        pendientes++;
    }

    public void resuelve(String solucion) {
        this.solucion = solucion;
        this.estado = "Resuelta";
        pendientes--;
    }

    @Override
    public String toString() {
        return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.problema
        + " - " + this.estado + (this.estado.equals("Resuelta") ? " - " + this.solucion : "");
    }
        
    public static int getPendientes() {
        return Incidencia.pendientes;
    }
}
