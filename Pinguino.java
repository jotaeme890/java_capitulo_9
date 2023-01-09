public class Pinguino extends Ave{
    public Pinguino () {
        super(Sexo.MACHO);
    }

    public Pinguino (Sexo s) {
        super(s);
    }

    public void nada(){
        System.out.println("Estoy nadandooooo");
    }
    public void vuela(){
        System.out.println("Soy pinguino no puedo volar");
    }
}
