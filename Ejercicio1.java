/**
 * 1 Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author jotaeme
 */

public class Ejercicio1{
    public static void main(String[] args) {
        ClaseCaballo rocinante = new ClaseCaballo("rocinante");

        rocinante.setDatos(2, 150, "árabe", "negro", "Macho");

        rocinante.corre();
        System.out.println();
        rocinante.salta();
        System.out.println();
        rocinante.relincha();
        System.out.println();
        System.out.println("Los datos del caballo son:");
        System.out.println(rocinante); //Ya que con el toString conseguimos hacer un print de lo que añadamos en el toString del Objeto
    }
}