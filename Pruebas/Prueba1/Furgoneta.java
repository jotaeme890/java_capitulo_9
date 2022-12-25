package Pruebas.Prueba1;
//extends es la palabra reservada que nos dice que la clase Furgoneta hereda de la superclase Coche, solo se puede heredar de una superclase
public class Furgoneta extends Vehiculo{
    private int capacidadCarga;
    private int plazasExtra;
    
    public Furgoneta(int plazasExtra, int capacidadCarga){
        //Con super(), llamamos al constructor padre para que le de un estado inicial a los atributos
        super();
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    //Getter
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;
    }


}
