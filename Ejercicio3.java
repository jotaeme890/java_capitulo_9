public class Ejercicio3 {
    public static void main(String[] args) {
        Pinguino tux = new Pinguino(Sexo.MACHO);
        tux.comer("palomitas");

        Perro laika = new Perro(Sexo.HEMBRA);
        laika.damePata();
        laika.amamanta();
        laika.ladra();

        Lagarto godzilla = new Lagarto(Sexo.MACHO);
        godzilla.escondete();
    }
}
