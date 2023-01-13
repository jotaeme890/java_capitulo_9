public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0;
        this.y = 0;
    }


    @Override 
    public String toString(){
        return "(" + this.x + ", " + this.y+ ")";
    } 
}
