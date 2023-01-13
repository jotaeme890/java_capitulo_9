public class Linea extends Punto{
    private Punto x;
    private Punto y;
    public Linea(Punto x, Punto y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "La línea formada por los puntos " + "" + this.x + ", " + this.y + "";
    }
}
