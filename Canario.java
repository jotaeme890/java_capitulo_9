public class Canario extends Ave{
    public Canario () {
        super(Sexo.MACHO);
    }

    public Canario (Sexo s) {
        super(s);
    }

    public void canta(){
        System.out.println("Tralaraaaa");
    }
    public void caza() {
        System.out.println("Los canarios no cazan");
    }
}
