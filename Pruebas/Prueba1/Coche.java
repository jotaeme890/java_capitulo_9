//ESTA ES LA CLASE, VÍDEO 33

package Pruebas.Prueba1;

//Empezamos poniendo los datos comunes a los coches
public class Coche{
    //Poenmos los atributos comunes
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor; //CC
    private int pesoPlataforma;

    //Ponemos los atributos propios de cada coche
    private String color;
    private int pesoFinal;
    private boolean asientos, climatizador;

    //Método constructor SIEMPRE TIENE QUE TENER EL MISMO NOMBRE QUE LA CLASE
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 1500;
        motor = 2000;
        pesoPlataforma = 500;
    }

    //Getter
    public String dimeDatosGenerales(){ 
        return "El vehículo tiene " + ruedas + " ruedas" + 
        "\nMide " + largo/1000 + " metros con un ancho de " + ancho + " centímetros" + 
        "\nUn peso de plataforma de " + pesoPlataforma + "Kg" + 
        "\nY tiene un motor de " + motor + "CC";
    }


    //Ejemplo de Setter, es decir, establece los datos para psarlo al Getter
    public void estableceColor(String colorCoche){
        color = colorCoche;
    }
    //Método Getter, obtenemos el dato del Setter de estableceColor()
    public String dimeColor(){ 
        return "El vehículo tiene un color de: " + color;
    }


    //Setter, si ponemos this. hace referencia al atributo de la clase y no al que se pasa por parámetro, ya que en este caso tienen el mismo nombre
    public void configuraAsientos(String asientos){
        if(asientos.equals("si")){
            this.asientos = true; 
        } else{
            this.asientos = false;
        }
    }
    //Getter
    public String dimeAsientos(){
        //En este caso no se pone this. ya que no hay confusión de otro nombre de método igual en este métogo Getter
        if(asientos == true){
            return "Este vehículo tiene asientos de cuero";
        } 
        return "Este vehículo tiene asientos de serie";
    }


    //Setter
    public void configuraClimatizador(String climatizador){
        if(climatizador.equals("si")){
            this.climatizador = true; 
        } else{
            this.climatizador = false;
        }
    }
    //Getter
    public String dimeClimatizador(){
        if(climatizador == true){
            return "Este vehículo tiene climatizador";
        } 
        return "Este vehículo tiene aire acondicionado";
    }


    //Setter y Getter juntos, !!!NO RECOMENDADO EN POO!!!
    public String dimePesoCoche(){
        int pesoCarroceria = 500;

        pesoFinal = pesoPlataforma + pesoCarroceria;

        if(asientos == true){
            pesoFinal += 50;
        }
        if(climatizador == true){
            pesoFinal += 20;
        }

        return "El vehículo total tiene un peso de: " + pesoFinal + "Kg";
    }
    
    /*
    //Así sería por separado
    public void configuraPesoTotal(){
        int pesoCarroceria = 500;
        this.pesoFinal = this.pesoPlataforma+pesoCarroceria;
        if(asientos == true){
            pesoFinal += 50;
        }
        if(climatizador == true){
            pesoFinal += 20;
        }
    }

    public String dimePesoTotal(){
        return "El vehículo total del vehículo es: " + pesoFinal;
    }
    */

    public String configuraPrecioCoche(){
        int precioFinal = 9000;
        if(this.asientos == true){
            precioFinal += 2500;
        }
        if(this.climatizador == true){
            precioFinal += 1200;
        }
        return "El precio del vehículo es: " + precioFinal + "E";
    }




    // TAMBÍEN SE PODRÍA HACER ESTO, PERO NO SE USARÍA LA MODULARIZACIÓN
    // SOLO TENDRÍA EL PUBLIC LA CLASE PRINCIPAL Y EL MAIN DEL ARCHIVO,
    // !!!NO RECOMENDADO!!!

    /*
    public static void main(String[] args) {
        //INSTANCIAR UNA CLASE, RENAULT ES UN EJEMPLAR DE LA CLASE COCHE, SIENDO COCHE() EL NOMBRE DEL CONSTRUCTOR
        Coche Renault = new Coche(); 

        System.out.print("El coche tiene " + Renault.ruedas + " ruedas");
    }

    class Camion{

    }

    class moto{

    }
    */
}