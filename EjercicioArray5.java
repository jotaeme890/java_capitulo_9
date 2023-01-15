import java.util.Scanner;

public class EjercicioArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Creamos el array de objetos de tipo artículo
        int N = 100;
        Articulo [] a = new Articulo [N];
        //Rellenamos el array de Artículos
        for (int i = 0; i < a.length; i++) {
            a[i] = new Articulo();
        }

        int opcion = 0;
        int i =0;
        int hueco;
        boolean existe;
        String codigoIntro = "";
        String nombreIntro = "";
        String descIntro = "";
        double vIntro = 0;
        double cIntro = 0;
        int entrada = 0;
        int salida = 0;
        
        System.out.println("Bienvenido a GESTISIMAL");
        System.out.print("¿Qué quiere hacer?");
        do {
            System.out.println();
            System.out.println("1. Listado");
            System.out.println("2. Alta artículo");
            System.out.println("3. Baja artículo");
            System.out.println("4. Modificación artículo");
            System.out.println("5. Entrada mercancía");
            System.out.println("6. Salida mercancía");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Listado de artículos");
                    System.out.println("--------------------");

                    for (i = 0; i < N; i++) {
                        if(!a[i].getCodigo().equals("LIBRE") ){
                            System.out.println(a[i]);
                            System.out.println("-----------------------------");
                        }
                    }

                    break;

                case 2:
                    System.out.println();
                    System.out.println("Alta de artículo");
                    System.out.println("----------------");

                    hueco = 0;
                    //Para buscar el primer hueco libre
                    while(!a[hueco].getCodigo().equals("LIBRE") && hueco < N){
                        hueco++;
                    }

                    if(hueco == N){
                        System.out.println("Lo siento, la BBDD está llena, borre algún elemento");
                    } else{
                        System.out.println("Enhorabuena, hay hueco para un nuevo elemento");
                        System.out.println("Dime los datos del nuevo artículo");
                        System.out.print("Código: ");
                        //Aquí buscamos que el código no sea el mismo, ya que todos los artículos deben tener un código diferente al resto
                        existe = true;
                        while (existe) {
                            existe = false;
                            codigoIntro = sc.next();
                            for (i = 0; i < N; i++) {
                                if(a[i].getCodigo().equals(codigoIntro)){
                                    //Esto hace que se repita el bucle ya que significa que otro artículo tiene el mismo código que otro del array 
                                    existe = true;
                                }
                            }

                            if(existe){
                                System.out.print("Lo siento, ese código ya existe, dime otro: ");
                            }
                        }

                        a[hueco].setCodigo(codigoIntro);
                        System.out.print("Nombre: ");
                        nombreIntro = sc.next();
                        a[hueco].setNombre(nombreIntro);
                        System.out.print("Descripción: ");
                        descIntro = sc.next();
                        a[hueco].setDescripcion(descIntro);
                        System.out.print("Precio Venta: ");
                        cIntro = sc.nextDouble();
                        a[hueco].setPrecioV(vIntro);
                        System.out.print("Precio Compra: ");
                        cIntro = sc.nextDouble();
                        a[hueco].setPrecioC(cIntro);

                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Baja de artículo");
                    System.out.println("----------------");

                    System.out.print("Dime el código del artículo que quieres borrar: ");
                    codigoIntro = sc.next();
                    //Recorro todo el array
                    hueco = -1;
                    do {
                        hueco++;
                        //Como tenemos que borrar, tenemos que ver que el código sea diferente al código que buscamos, ya que cuando sea el mismo es el que tenemos que borrar
                    } while (!a[hueco].getCodigo().equals(codigoIntro) && hueco<N);

                    if (hueco == N) {
                        System.out.println("Lo siento, este código no existe en la BBDD");
                    } else{
                        a[hueco].setCodigo("LIBRE");
                        System.out.println("Artículo eliminado correctamente");
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Modificación de artículo");
                    System.out.println("----------------");

                    System.out.println("¿De qué artículo quiere hacer la modificación?");
                    codigoIntro = sc.next();

                    hueco = -1;
                    do {
                        hueco++;
                    } while (hueco < N && a[hueco].getCodigo().equals(codigoIntro));

                    if(hueco == N){
                        System.out.println("Lo siento, esse artículo no está en la BBDD");
                    } else{
                        System.out.println("Vamos a modificar este artículo");
                        System.out.println("Código: " + a[hueco].getCodigo());
                        System.out.print("Código nuevo: ");
                        //Aquí buscamos que el código no sea el mismo, ya que todos los artículos deben tener un código diferente al resto
                        existe = true;
                        while (existe) {
                            existe = false;
                            codigoIntro = sc.next();
                            for (i = 0; i < N; i++) {
                                if(a[i].getCodigo().equals(codigoIntro)){
                                    //Esto hace que se repita el bucle ya que significa que otro artículo tiene el mismo código que otro del array 
                                    existe = true;
                                }
                            }
                            if(existe){
                                System.out.print("Lo siento, ese código ya existe, dime otro: ");
                            }
                        }
                        a[hueco].setCodigo(codigoIntro);
                        
                        System.out.println("Nombre: " + a[hueco].getNombre());
                        System.out.print("Nombre nuevo: ");
                        nombreIntro = System.console().readLine();
                        a[hueco].setNombre(nombreIntro);

                        System.out.println("Descripción: " + a[hueco].getDescripcion());
                        System.out.print("Nombra descripción: ");
                        descIntro = System.console().readLine();
                        a[hueco].setDescripcion(descIntro);

                        System.out.println("Precio Venta: " + a[hueco].getPrecioV());
                        System.out.print("Precio Venta nuevo: ");
                        vIntro = sc.nextDouble();
                        a[hueco].setPrecioV(vIntro);

                        System.out.println("Precio Compra: " + a[hueco].getPrecioC());
                        System.out.print("Precio Compra nuevo: ");
                        cIntro = sc.nextDouble();
                        a[hueco].setPrecioC(cIntro);

                    }

                    break;

                case 5:
                    System.out.println();
                    System.out.println("Entrada de mercancía");
                    System.out.println("----------------");

                    System.out.println("Buenas, ¿De que árticulo ha llegado la mercancía? (Introduzca el código)");
                    codigoIntro = sc.next();

                    hueco = -1;
                    do {
                        hueco++;
                    } while (hueco < N && a[hueco].getCodigo().equals(codigoIntro));

                    if(hueco == N){
                        System.out.println("Lo siento, este código no existe en la BBDD");
                    } else{
                        System.out.println("¿Cuánta mercancía de este artículo ha entrado?");
                        entrada = sc.nextInt();
                        a[hueco].setCantidad(entrada+a[hueco].getCantidad());
                    }
                    break;

                case 6:
                System.out.println();
                System.out.println("Entrada de mercancía");
                System.out.println("----------------");

                System.out.println("Buenas, ¿De que árticulo sale la mercancía? (Introduzca el código)");
                codigoIntro = sc.next();

                hueco = -1;
                do {
                    hueco++;
                } while (hueco < N && a[hueco].getCodigo().equals(codigoIntro));

                if(hueco == N){
                    System.out.println("Lo siento, este código no existe en la BBDD");
                } else{
                    System.out.println("¿Cuánta mercancía de este artículo va a salir?");
                    salida = sc.nextInt();
                    if(salida > a[hueco].getCantidad()){
                        System.out.println("Lo siento, no tenemos tanto Stock");
                    } else{
                        a[hueco].setCantidad(a[hueco].getCantidad()-salida);
                    }
                }
                    break;
                
                default:
                    break;
            }
        } while (opcion != 7);
        System.out.println("¡Hasta pronto!");
        sc.close();
    }
}
