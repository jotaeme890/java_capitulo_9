public class Tiempo {
    private int s;

    public Tiempo(int h, int m, int s){
        //Pasamos todo a segundos
        this.s = (h*3600) + (m*60) + s;
    }

    public Tiempo(int s){
        //Pasamos todo a segundos
        this.s = s;
    }

    public String toString(){
        int segundos = this.s;
        int hora = segundos /3600;
        segundos -= hora*3600;
        int min = segundos/60;
        segundos -= min*60;

        if(this.s < 0){
            return "No se puede tener una hora en negativo";
        }
            return hora + "h " + min + "min " + segundos + "s"; 
    }

    private int getSegundos(){
        return this.s;
    }

    public Tiempo suma(Tiempo t){
        return new Tiempo(this.s + t.getSegundos());
    }

    public Tiempo resta(Tiempo t){
        return new Tiempo(this.s - t.getSegundos());
    }

}