import java.util.Scanner;

public class EjercicioArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Disco [] d = new Disco [100];

        for (int i = 0; i < d.length; i++) {
            d[i] = new Disco();
        }

        int opcion = 0;
        String codigo;
        String titulo;
        String autor;
        String genero;
        int duracion;

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
                    int libre = -1;
                    do {
                        libre++;
                    } while (!d[libre].getCodigo().equals("LIBRE"));

                    System.out.println("Hemos encontrado un hueco en la colección, dime los datos del Disco:");
                    System.out.print("Código: ");
                    codigo = sc.next();
                    System.out.print("Título: ");
                    titulo = sc.next();
                    System.out.print("Autor: ");
                    autor = sc.next();
                    System.out.print("Género: ");
                    genero =sc.next();
                    System.out.print("Duración: ");
                    duracion = sc.nextInt();

                    d[libre] = new Disco(codigo, titulo, autor, genero, duracion);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Borrar disco");
                    System.out.println("-----------------------------");
                    System.out.println("Dime el código del disco que quieres borrar: ");
                    codigo = sc.nextLine();
                    libre = -1;
                    do {
                        libre++;
                    } while (!d[libre].getCodigo().equals(codigo));
                    d[libre].setCodigo("LIBRE");
                    System.out.println("Enhorabuena, el disco ha sido eliminado correctamente");

                    break;

                case 3:
                    System.out.println();
                    System.out.println("Listado de discos");
                    System.out.println("-----------------------------");
                    for (int i = 0; i < d.length; i++) {
                        if (!d[i].getCodigo().equals("LIBRE")) {
                            System.out.println(d[i]);
                            System.out.println("-----------------------------");
                        }
                    }


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

    }
}
