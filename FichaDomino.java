public class FichaDomino {
    private int izq;
    private int der;

    public FichaDomino(int izq, int der){
        this.izq = izq;
        this.der = der;
    }

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
