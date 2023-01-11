public class Revista extends Publicacion{
    private static int num;
    
    public Revista(String isbn, String titulo, int anioP, int numero){
        super(isbn, titulo, anioP);
        Revista.num = numero;
    }

    public int getNumero(){
        return Revista.num;
    }
}
