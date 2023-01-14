public class Linea extends Punto{
    private Punto origen;
    private Punto fin;
    public Linea(Punto x, Punto y){
        this.origen = x;
        this.fin = y;
    }

    @Override
    public String toString(){
        return "La línea formada por los puntos " + "" + this.origen + ", " + this.fin + "";
    }
}
