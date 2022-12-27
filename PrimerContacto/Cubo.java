package PrimerContacto;
public class Cubo {
    int capacidad;
    int contenido;

    public Cubo(int capacidad){
        this.capacidad = capacidad;
    }

    public int getCapacidad(){ 
        return this.capacidad;
    }

    public int getContenido(){ 
        return this.contenido;
    }

    public void setContenido(int litros){
        this.contenido = litros;
    }

    //Setter para vaciar el contenido del cubo
    public void vaciaCubo(){
        this.contenido = 0;
    }

    //Setter para llenar el contenido del cubo
    public void llenaCubo(){
        this.contenido = this.capacidad;
    }

    //Pintamos el cubo
    public void pintaCubo(){
        for(int nivel = this.capacidad ; nivel > 0; nivel--){
            if(this.contenido >= nivel){
                System.out.println("#---#");
            } else{
                System.out.println("#   #");
            }
        }
        System.out.println("#####");
    }

    //Volcamos el cubo en otro
    public void VuelcaCubo(Cubo destino){
        int libres = destino.getCapacidad() - destino.getContenido();

        if(libres > 0){
            if(this.contenido <= libres){
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vaciaCubo();
            }
        } else{
            this.contenido -= libres;
            destino.llenaCubo();
        }
    }
}

