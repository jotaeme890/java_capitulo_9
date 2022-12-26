public class Cubo {
    int capacidad;
    int contenido;

    public Cubo(int capacidad){
        this.capacidad = capacidad;
    }

    public int dimeCapacidad(){ 
        return capacidad;
    }

    public int dimeContenido(){ 
        return contenido;
    }

    public void estableContenido(int litros){
        contenido = litros;
    }

    //Setter para vaciar el contenido del cubo
    public void vaciaCubo(){
        contenido = 0;
    }

    //Setter para llenar el contenido del cubo
    public void llenaCubo(){
        contenido = capacidad;
    }

    //Pintamos el cubo
    public void pintaCubo(){
        for(int nivel = this.capacidad ; nivel > 0; nivel++){
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
        int libres = destino.dimeCapacidad() - destino.dimeContenido();

        if(libres > 0){
            if(this.contenido <= libres){
                destino.estableContenido(destino.dimeContenido() + this.contenido);
                this.vaciaCubo();
            }
        } else{
            this.contenido -= libres;
            destino.llenaCubo();
        }
    }
}

