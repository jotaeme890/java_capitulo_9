import java.util.Scanner;

public class EjercicioArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Gato [] g = new Gato [4];

        System.out.println("A continuación añada los datos de los gatos por favor");
        
        for (int i = 0; i < g.length; i++) {
            g[i] = new Gato();
            System.out.println("Gato " + (i+1));
            System.out.print("Nombre: ");
            g[i].setNombre(sc.nextLine());
            System.out.print("Raza: ");
            g[i].setRaza(sc.nextLine());
            System.out.print("Color: ");
            g[i].setColor(sc.nextLine());
        }

        System.out.println();
        System.out.println("Los datos de los gatos introducidos son");

        for (int i = 0; i < g.length; i++) {
            System.out.println("Gato " + (i+1));
            System.out.println("Nombre: " + g[i].getNombre() + "\nRaza: " + g[i].getRaza() + "\nColor: " + g[i].getColor() + "\n---------------------------------------------------");
        }
        sc.close();
    }
}
