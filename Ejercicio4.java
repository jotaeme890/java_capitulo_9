public class Ejercicio4 {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(4, 2);
        System.out.println(fraccion.invierte());

        Fraccion fraccion2 = new Fraccion(16, 2);
        System.out.println(fraccion.multiplica(fraccion2));
        System.out.println(fraccion2.simplifica());
    }
}
