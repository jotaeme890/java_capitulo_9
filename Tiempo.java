public class Tiempo implements Cloneable{
    private int s;

    public Tiempo(int h, int m, int s){
        //Pasamos todo a segundos
        this.s = (h*3600) + (m*60) + s;
    }

    public int getHoras(){
        return this.s/3600;
    }

    public int getMin(){
        return this.s%3600/60;
    }

    private int getSegundos(){
        return this.s%3600%60;
    }

    @Override
    public Tiempo clone(){
        return new Tiempo(this.getHoras(), this.getMin(), this.getSegundos());
    }

    public Tiempo(Tiempo t){
        //Pasamos todo a segundos
        this(t.getHoras(),t.getMin(),t.getSegundos());
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

    public Tiempo suma(Tiempo t){
        return new Tiempo(this.s + t.getSegundos());
    }

    public Tiempo resta(Tiempo t){
        return new Tiempo(this.s - t.getSegundos());
    }

}
