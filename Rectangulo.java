public class Rectangulo {
    private int altura;
    private int ancho;
    private static int RectangulosCreados;

    public Rectangulo(int ancho, int altura){
        this.altura = altura;
        this.ancho = ancho;
        RectangulosCreados++;
    }

    public static int getRectangulosCreados(){
        return Rectangulo.RectangulosCreados;
    }

    @Override
    public String toString(){
        String piramide = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0 ; j < ancho; j++) {
                piramide+= "*";
            }
            piramide += "\n";
        }
        return piramide;
    }
}
