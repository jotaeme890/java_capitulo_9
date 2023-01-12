public class Terminal {
    private String numero;
    private int tiempoTot;

    public Terminal(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    public int getTiempoTot() {
        return tiempoTot;
    }

    public void llama(Terminal movil, int tiempo){
        movil.tiempoTot += tiempo;
        this.tiempoTot += tiempo;
    }

    @Override
    public String toString(){
        return "Nº " + numero + " - " + this.tiempoTot + "s de conversación ";
    }
}
