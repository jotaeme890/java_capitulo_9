public class Pizzas {
    private static int totPizzasP = 0;
    private static int totPizzasS = 0;

    private String estado;
    private String tipo;
    private String tamano;


    public Pizzas(String tipo, String tamano){
        estado = "pedida";
        this.tipo = tipo;
        this.tamano = tamano;
        totPizzasP++;
    }

    public String toString(){
        return "pizza: " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    public static int getTotalPedidas(){
        return Pizzas.totPizzasP;
    }

    public static int getTotalServidas(){
        return Pizzas.totPizzasS;
    }

    public void sirve(){
        if(this.estado.equals("pedida")){
            this.estado = "servida";
            totPizzasS++;
        } else{
            System.out.println("Ya está servida");
        }
    }
}
