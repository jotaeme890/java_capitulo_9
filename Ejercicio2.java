/**
 * 2 Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
        int opcion = 0;
        int km = 0;

        Bicicleta tornado = new Bicicleta();
        Coche bugatti = new Coche();

        while (opcion!=8) {
            System.out.println("\nVEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántos km quieres hacer?");
                    km = sc.nextInt();
                    tornado.avanzado(km);
                break;
                case 2:
                    tornado.hacerCaballito();
                break;
                case 3:
                    System.out.println("¿Cuántos km quieres hacer?");
                    km = sc.nextInt();
                    bugatti.avanzado(km);
                break;
                case 4:
                    bugatti.hacerDerrape();
                break;
                case 5:
                    System.out.println("El kilometraje de la bicicleta es: " + tornado.getKmRecorridos() + "Km");
                break;
                case 6:
                    System.out.println("El kilometraje del coche es: " + bugatti.getKmRecorridos() + "Km");
                break;
                case 7:
                    System.out.println("El kilometraje total es: " + Vehiculo.getKmTotales() + "Km");
                break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
