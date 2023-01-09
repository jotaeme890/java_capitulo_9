import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Zona vip = new Zona(25);
        Zona principal = new Zona (1000);
        Zona compraVenta = new Zona (200);

        int opcion = 0;
        int opcion2 = 0;
        int n = 0;

        do {
            System.out.println("1. Mostrar número de entradas libres\n2. Vender entradas\n3. Salir");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("En la zona principal hay: " + principal.getEntradasPorVender());
                    System.out.println("En la zona vip hay: " + vip.getEntradasPorVender());
                    System.out.println("En la zona compraVenta hay: " + compraVenta.getEntradasPorVender());
                break;

                case 2:
                    System.out.println("¿Para dónde la quieres?");
                    System.out.println("\n1. Zona principal\n2. Zona VIP\n3. Zona Compraventa");
                    opcion2 = sc.nextInt();

                    System.out.println("¿Cuántas quieres?");
                    n = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            principal.vender(n);
                        break;
                        case 2:
                            vip.vender(n);
                        break;
                        case 3:
                            compraVenta.vender(n);
                        break;
                        default:
                        break;
                    }
                break;
                default:
                break;
            }
        } while (opcion != 3);
    }
}
