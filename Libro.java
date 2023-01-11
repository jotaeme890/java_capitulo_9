public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;

    public Libro(String isbn, String titulo, int anioP){
        super(isbn, titulo, anioP);
        this.prestado = true;
    }

    @Override
    public String toString(){
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }

    public void presta(){
            this.prestado = true;
    }

    public void devuelve(){
        System.out.println("Lo siento, este libro ya está prestado");
        this.prestado = false;
    }

    public boolean estaPrestado(){
        return this.prestado;
    }
}
