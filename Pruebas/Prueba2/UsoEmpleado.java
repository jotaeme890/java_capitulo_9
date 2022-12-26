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

        Jefatura jefeRRHH = new Jefatura("Pedro Pica Piedras", 55000, 2022, 1, 22);

        jefeRRHH.estableceIncentivo(2570);

        //Lo mismo pero con un array
        Empleado[] empleados = new Empleado[6];

        empleados[0] = new Empleado("Jotaeme", 1250, 2018,10,27);
        empleados [1] = new Empleado("Paco Pepe", 1750, 2015,1,31);
        empleados [2] = new Empleado("Federico", 2250, 2010,6,14);
        empleados [3] = new Empleado("Pepe Pérez");

        // Polimorfismo, principio de sustitución (usar un ejemplo de la subclase cuando el programa espere uno de la superclase)
        empleados[4] = jefeRRHH; 
        empleados[5] = new Jefatura("Federica", 2800, 2022, 1, 22);

        for(Empleado e: empleados){
            e.aumentarSueldo(5);
        }

        //Aquí nos damos cuenta del polimorfirmo ya que e: es de tipo Empleado y cuando llega a los jefes se comporta con un tipo Jefatura, y por eso llama al dimeSueldo de Jefatura y no de Empleado, poniendole el incentivo,
        // esto se hace mediante el enlazado dinámico que lo hacce de manera automática la JVM 
        for (Empleado e: empleados) {
            System.out.println("\nNombre: " +e.dimeNombre() + "\nSueldo: " + e.dimeSueldo() + "\nFecha de alta: " + e.dimeAlta());
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


