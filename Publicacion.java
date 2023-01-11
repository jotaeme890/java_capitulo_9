public abstract class Publicacion {
    private String isbn;
    private String titulo;
    private int anioP;

    public Publicacion (String isbn, String titulo, int anioP){
        this.anioP = anioP;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String toString(){
        return "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.anioP;
    }
}
