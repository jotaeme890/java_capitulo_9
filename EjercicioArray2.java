public class EjercicioArray2 {
    public static void main(String[] args) {
        Gato [] g = new Gato [4];

        g[0] = new Gato("Garfield" ,"Siamés","Naranja");
        g[1] = new Gato("Tom" ,"Come ratones","Gris");
        g[2] = new Gato("Misifú" ,"Picapiedra","Verde");
        g[3] = new Gato("Doby" ,"Siamés","Blanco");

        System.out.println("Los datos de los gatos introducidos son los siguientes: ");

        for (int i = 0; i < g.length; i++) {
            System.out.println("Gato " + (i+1));
            System.out.println("Nombre: " + g[i].getNombre() + "\nRaza: " + g[i].getRaza() + "\nColor: " + g[i].getColor() + "\n---------------------------------------------------");
        }
    }
}
