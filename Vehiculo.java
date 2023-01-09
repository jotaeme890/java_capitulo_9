public class Vehiculo{
    //De Objeto
    private int kilometrosRecorridos;

    //De clase
    private static int vehiculosCreados; //NO SE USA
    private static int kilometrosTotales;

    public Vehiculo(){
    //El primer valor de los KM recorridos será 0, por ello le daremos un valor inicial
        this.kilometrosRecorridos = 0;
    }
    //Para saber los km recorridos del coche o de la bici
    public int getKmRecorridos() {
        return this.kilometrosRecorridos;
    }
    //¿Cuántos km ha hecho tanto la bici como el coche?
    public static int getKmTotales(){
        //El return es de Vehiculo ya que pertenece a un atributo de la clase y no del Objeto(this)
        return Vehiculo.kilometrosTotales;
    }

    //Creamos el método para avanzar
    public void avanzado(int km){
        //Le añadimos los km de la bici o el coche
        this.kilometrosRecorridos += km;
        //Añadimos los km totales entre ambos
        Vehiculo.kilometrosTotales += km;
    }
}