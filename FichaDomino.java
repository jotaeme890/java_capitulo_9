public class FichaDomino {
    private int izq;
    private int der;

    public FichaDomino(int izq, int der){
        this.izq = izq;
        this.der = der;
    }

    //Ejercicio 15
    public FichaDomino() {
        this.izq = (int) (Math.random() * 7);
        this.der = (int) (Math.random() * 7);
    }

        /*Nos devuelve true o false si entra o no en la fila, es decirr, el lado derecho de la ficha es igual al del izquierdo de la que se pasa como parámetro*/
    boolean encajaEnFila(FichaDomino ficha) {
        return der == ficha.izq;
    }
    /////////////////////////////////////////////////
        

    public int getIzq (){
        return this.izq;
    }
    
    public int getDer (){
        return this.der;
    }

    @Override
    public String toString(){
        return "[ "+ this.izq + " | " + this.der + " ]";
    }

    public FichaDomino voltea(){
        return new FichaDomino(this.der, this.izq);
    }

    public boolean encaja(FichaDomino x){
        return this.der ==  x.getIzq() || this.der == x.getDer() || this.izq == x.getIzq() || this.izq == x.getDer();
    }
}
