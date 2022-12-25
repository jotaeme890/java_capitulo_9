package Pruebas.Prueba2;

//Para la fecha del alta de Contrato
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*
        //El mes va a ser -1, ya que así lo establecimos en la clase
        Empleado empleado1 = new Empleado("Jotaeme", 1250, 2018,10,27);
        Empleado empleado2 = new Empleado("Paco Pepe", 1750, 2015,1,31);
        Empleado empleado3 = new Empleado("Federico", 2250, 2010,6,14);
        
        empleado1.aumentarSueldo(15);
        empleado2.aumentarSueldo(10);
        empleado3.aumentarSueldo(5);

        System.out.println("Nombre: " + empleado1.dimeNombre() + "\nSueldo: " + empleado1.dimeSueldo() + "\nFecha de alta: " + empleado1.dimeAlta());
        System.out.println("\nNombre: " + empleado2.dimeNombre() + "\nSueldo: " + empleado2.dimeSueldo() + "\nFecha de alta: " + empleado2.dimeAlta());
        System.out.println("\nNombre: " + empleado3.dimeNombre() + "\nSueldo: " + empleado3.dimeSueldo() + "\nFecha de alta: " + empleado3.dimeAlta());
        */

        //Lo mismo pero con un array
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Jotaeme", 1250, 2018,10,27);
        empleados [1] = new Empleado("Paco Pepe", 1750, 2015,1,31);
        empleados [2] = new Empleado("Federico", 2250, 2010,6,14);
        empleados [3] = new Empleado("Pepe Pérez");

        empleados[0].aumentarSueldo(15);
        empleados [1].aumentarSueldo(10);
        empleados [2].aumentarSueldo(5);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nNombre: " + empleados[i].dimeNombre() + "\nSueldo: " + empleados[i].dimeSueldo() + "\nFecha de alta: " + empleados[i].dimeAlta());
        }
    }
}



//Cuándo usemos esta forma de hacer los ficheros (clases y main en el mismo), solo puede tener 1 método público y otro main , no muy recomendable
class Empleado{
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    
    //Recibe los parámetros o argumentos
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        //Para crear el archivo date, usaremos lo siguiente:
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1/*Se pone -1 ya que Enero para él es 0*/, dia);
        altaContrato = calendario.getTime();
    }


    //Implemenatamos la sobrecarga en el constructor, ya que no debe por que saberse los demás datos que se pasan por parámetro
    //Para ello usaremos this, ya que lo usaremos para poner por "defecto", los atributos que no sepamos de los Objetos, dicho 
    //this llama al otro constructor de la clase, si hubiese más iría a aquel que tenga los mismos parámetros
    public Empleado(String nom){
        this(nom, 1200, 2022, 1, 1);
    }

    //Getter
    public String dimeNombre(){
        return nombre;
    }

    //Getter    
    public double dimeSueldo(){
        return sueldo;
    }

    //Setter
    public void aumentarSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    //Getter
    public Date dimeAlta(){
        return altaContrato;
    }
}

class Jefatura extends Empleado{

    private double incentivo; 

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom,sue,agno,mes,dia);
    }

    public void estableceIncentivo(double b){
        incentivo = b;
    }

    //No nos sirve dimeSueldo ya que el jefe tien la posibilidad de sumarle un incentivo, al contrario del Empleado
    //Con este método machacamos el método dimeSueldo de la clase padre, ESTO SOLO SE HACE PARA LA CLASE JEFATURA
    public double dimeSueldo(){
        //Este dimeSueldo es de la clase padre
        double sueldoJefe = super.dimeSueldo();
        return sueldoJefe + incentivo;
    }
}


