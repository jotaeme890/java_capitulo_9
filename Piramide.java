public class Piramide {
    private int altura;
    private static int piramidesCreadas;

    public Piramide(int altura){
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas(){
        return Piramide.piramidesCreadas;
    }

    @Override
    public String toString(){
        String piramide = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0 ; j < altura-i; j++) {
                piramide+= " ";
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                piramide += "*";
            }
            piramide += "\n";
        }
        return piramide;
    }
}
