public class Gato extends Mamifero{
    public Gato () {
        super(Sexo.MACHO);
    }

    public Gato (Sexo s) {
        super(s);
    }

    public void maulla(){
        System.out.println("Miauuuu");
    }

    public void caza(){
        System.out.println("Estoy cazando");
    }
}
