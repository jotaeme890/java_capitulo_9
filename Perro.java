public class Perro extends Mamifero{
    public Perro () {
        super(Sexo.MACHO);
    }

    public Perro (Sexo s) {
        super(s);
    }

    public void ladra(){
        System.out.println("GuauGuauGuau");
    }
    
    public void damePata(){
        System.out.println("Coge mi pata");
    }
}
