package PrimerContacto;
public class PruebaCubo {
    public static void main(String[] args) {
        Cubo cubito = new Cubo(2);
        Cubo cubote = new Cubo(7);
        System.out.println("Cubito: \n");
        cubito.pintaCubo();
        System.out.println("\nCubote: \n");
        cubote.pintaCubo();
        System.out.println("\nLleno el cubito: \n");
        cubito.llenaCubo();
        cubito.pintaCubo();
        System.out.println("\nEl cubote sigue vacío: \n");
        cubote.pintaCubo();
        System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
        cubito.VuelcaCubo(cubote);
        System.out.println("Cubito: \n");
        cubito.pintaCubo();
        System.out.println("\nCubote: \n");
        cubote.pintaCubo();
        System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito.\n");
        cubote.VuelcaCubo(cubito);
        System.out.println("Cubito: \n");
        cubito.pintaCubo();
        System.out.println("\nCubote: \n");
        cubote.pintaCubo();
    }
}
