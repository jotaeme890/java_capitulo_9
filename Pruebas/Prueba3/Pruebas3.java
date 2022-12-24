package Pruebas.Prueba3;

public class Pruebas3 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Paco");
        Empleado empleado2 = new Empleado("Federico");

        empleado1.estableceSeccion("RRHH");
        //empleado1.estableceNombre("Pedro");
        System.out.println(empleado1.dimeDatos());

        System.out.println();

        System.out.println(empleado2.dimeDatos());
    }
}

class Empleado{
    //Creamos el atributo en una constante, esto hace que no se pueda modificar dicha variable en otro punto del programa
    private final String nombre;
    private String seccion;

    public Empleado(String nom){
        nombre = nom;
        seccion = "Administración";
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
        return nombre + ", tu su sección es: " + seccion;
    }
}
