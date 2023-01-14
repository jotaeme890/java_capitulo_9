import java.util.Scanner;

public class EjercicioArray4 {
    public static void main(String[] args) {
        int N = 100;
        Scanner sc = new Scanner (System.in);
        Disco [] d = new Disco [N];

        for (int i = 0; i < d.length; i++) {
            d[i] = new Disco();
        }

        int i;
        int opcion = 0;
        String codigo;
        String titulo;
        String autor;
        String genero;
        int duracion;
        String autorIntro;
        String generoIntro;
        String codigoIntro = "";
        int min;
        int max;
        int libre;
        boolean existe;


        d[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        d[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
        d[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
        
        do {
            System.out.println();
            System.out.println("¿Qué es lo que quiere hacer? ");
            System.out.println("1. Crear Disco");
            System.out.println("2. Borrar Disco");
            System.out.println("3. Listar Discos");
            System.out.println("4. Modificar Disco");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Añadir disco");
                    System.out.println("-----------------------------");
                    libre = 0;

                    while (libre < N && !d[libre].getCodigo().equals("LIBRE")) {
                        libre++;
                    }

                    if(libre == N){
                        System.out.println("Lo siento, no hay hueco en la BBDD, borra algún elemento");
                    } else{
                        System.out.println("Dime los datos del disco");
                        System.out.print("Código: ");
                        existe = true;
                        while (existe) {
                            existe = false;
                            codigoIntro = sc.next();
                            for(i = 0; i < N;i++){
                                if(d[i].getCodigo().equals(codigoIntro)){
                                    existe=true;
                                }
                            }
                        }
                    }
                    d[libre].setCodigo(codigoIntro);

                    System.out.print("Título: ");
                    titulo = sc.next();
                    d[libre].setTitulo(titulo);
                    System.out.print("Autor: ");
                    autor = sc.next();
                    d[libre].setAutor(autor);
                    System.out.print("Género: ");
                    genero =sc.next();
                    d[libre].setGenero(genero);
                    System.out.print("Duración: ");
                    duracion = sc.nextInt();
                    d[libre].setDuracion(duracion);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Borrar disco");
                    System.out.println("-----------------------------");
                    System.out.println("Dime el código del disco que quieres borrar: ");
                    codigoIntro = System.console().readLine();
                    i = -1;
                    codigo = "";
                    do {
                        i++;
                        if (i < N) {
                            codigo = d[i].getCodigo();
                        }
                    } while (!(codigo.equals(codigoIntro)) && (i < N));
                    if (i == N) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        d[i].setCodigo("LIBRE");
                        System.out.println("Album borrado.");
                    }
                    break;

                case 3:
                    int opcionListado = 0;
                    do {
                        System.out.println();
                        System.out.println("Qué quiere ver:");
                        System.out.println("1. Lista completa");
                        System.out.println("2. Autor");
                        System.out.println("3. Género");
                        System.out.println("4. Intervalo de duración");
                        System.out.println("5. Salir");
                        System.out.print("Opción: ");
                        opcionListado = sc.nextInt();

                        switch (opcionListado) {
                            case 1:
                                System.out.println();
                                System.out.println("Listado completo");
                                System.out.println("-----------------------------");
                                for (i = 0; i < d.length; i++) {
                                    if (!d[i].getCodigo().equals("LIBRE")) {
                                        System.out.println(d[i]);
                                        System.out.println("-----------------------------");
                                    }
                                }
                                break;
                                
                            case 2:
                                System.out.println();
                                System.out.print("¿Qué autor quiere ver?");
                                autorIntro = sc.next();
                                System.out.println();
                                System.out.println("Listado de " + autorIntro);
                                System.out.println("-----------------------------");
                                for (i = 0; i < d.length; i++) {
                                    if(!d[i].getCodigo().equals("LIBRE") && d[i].getAutor().equals(autorIntro)){
                                        System.out.println(d[i]);
                                        System.out.println("-----------------------------");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println();
                                System.out.print("¿Qué género quiere ver?");
                                generoIntro = sc.next();
                                System.out.println();
                                System.out.println("Listado de " + generoIntro);
                                System.out.println("-----------------------------");
                                for (i = 0; i < d.length; i++) {
                                    if(!d[i].getCodigo().equals("LIBRE") && d[i].getGenero().equals(generoIntro)){
                                        System.out.println(d[i]);
                                        System.out.println("-----------------------------");
                                    }
                                }
                                break;

                            case 4:
                                System.out.println();
                                System.out.println("¿Qué intervalo quiere ver?");
                                System.out.print("Mínimo: ");
                                min = sc.nextInt();
                                System.out.print("Máximo: ");
                                max = sc.nextInt();
                                System.out.println("Listado de " + min + ", " + max + " minutos");
                                System.out.println("-----------------------------");
                                for (i = 0; i < d.length; i++) {
                                    if(!d[i].getCodigo().equals("LIBRE") && d[i].getDuracion()<=max && d[i].getDuracion()>=min){
                                        System.out.println(d[i]);
                                        System.out.println("-----------------------------");
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        
                    } while (opcionListado != 5);



                    break;

                case 4:
                    System.out.println();
                    System.out.println("Modificar disco");
                    System.out.println("-----------------------------");

                    System.out.println("Dime el código del disco que quieres borrar: ");
                    codigo = sc.next();
                    libre = -1;
                    do {
                        libre++;
                    } while (!d[libre].getCodigo().equals(codigo));

                    System.out.println("Dime los nuevos datos del disco (si le da a ENTER se quedan igual)");

                    System.out.println("Código: " + d[libre].getCodigo());
                    System.out.println("Nuevo código: ");
                    codigo = sc.next();
                    if(!codigo.equals("")){
                        d[libre].setCodigo(codigo);
                    }

                    System.out.println("Autor: " + d[libre].getAutor());
                    System.out.println("Nuevo autor: ");
                    autor = sc.next();
                    if(!autor.equals("")){
                        d[libre].setAutor(autor);
                    }

                    System.out.println("Título: " + d[libre].getTitulo());
                    System.out.println("Nuevo título: ");
                    titulo = sc.next();
                    if(!titulo.equals("")){
                        d[libre].setTitulo(titulo);
                    }

                    System.out.println("Género: " + d[libre].getGenero());
                    System.out.println("Nuevo género: ");
                    genero = sc.next();
                    if(!genero.equals("")){
                        d[libre].setCodigo(genero);
                    }

                    System.out.println("Duración: " + d[libre].getDuracion());
                    System.out.println("Nueva duración: ");
                    String duracionmod = sc.next();
                    if(!duracionmod.equals("")){
                        d[libre].setDuracion(Integer.parseInt(duracionmod));
                    }

                    break;

                default:
                    break;
            }

        } while (opcion != 5);
        sc.close();

    }
}
