public class Ameba {
    private int peso;

    public Ameba(){
        this.peso = 3;
    }

    void come(int n){
        this.peso += n-1; 
    }

    void come(Ameba n){
        this.peso += n.peso-1;
        n.peso = 0;
    }

    public String toString(){
        return "Soy una Ameba y peso " + this.peso + " microgramos";
    }
}
