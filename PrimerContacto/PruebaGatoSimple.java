package PrimerContacto;
public class PruebaGatoSimple {
    public static void main(String[] args) {
        GatoSimple Tom = new GatoSimple("macho");

        System.out.println("Hola gatito");
        Tom.gatoMaulla();
        System.out.println("Toma comida gatito");
        Tom.gatoCome("Pastel de manzana");
        System.out.println("Bueno, ten que esto te gusta");
        Tom.gatoCome("pescado");

        GatoSimple Lisa = new GatoSimple("hembra");

        System.out.println("Enseñarme, cómo maulláis gatitos");
        Tom.gatoMaulla();
        Lisa.gatoMaulla();

        System.out.println("Pelearse");
        Tom.gatoPelea(Lisa);
    }
}
