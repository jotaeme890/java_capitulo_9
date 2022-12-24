package Pruebas.Prueba3;

public class Pruebas3 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Paco");
        Empleado empleado2 = new Empleado("Federico");
        Empleado empleado3 = new Empleado("Francisco");

        empleado1.estableceSeccion("RRHH");
        //empleado1.estableceNombre("Pedro");
        System.out.println(empleado1.dimeDatos());

        System.out.println();

        System.out.println(empleado2.dimeDatos());

        System.out.println();

        System.out.println(empleado3.dimeDatos());
    }
}

class Empleado{
    //Creamos el atributo en una constante, esto hace que no se pueda modificar dicha variable en otro punto del programa
    private final String nombre;
    private int id; 
    //Con static lo que hacemos es que cada atributo no sea una copia si no que solo haya uno y no pertenece al objeto si no que pertenece a la clase
    public static int idSiguiente = 1;
    private String seccion;

    public Empleado(String nom){
        nombre = nom;
        seccion = "Administración";
        id = idSiguiente;
        idSiguiente++;
    }

    /* 
    ESTO SE PUEDE PONER YA QUE TENEMOS ESTA VARIABLE COMO UNA CONSTANTE
    public void estableceNombre(String nombre){
        this.nombre = nombre;
    }
    */

    public void estableceSeccion(String seccion){
        this.seccion = seccion;
    }

    public String dimeDatos(){
        return nombre + ", tu su sección es: " + seccion + ". Y tú id es: " +id;
    }
}
