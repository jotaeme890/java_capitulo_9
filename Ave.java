public class Ave extends Animal{
    public Ave () {
        super(Sexo.MACHO);
    }

    public Ave (Sexo s) {
        super(s);
    }

    public void ponHuevo(){
        if(this.getSexo() == Sexo.MACHO){
            System.out.println("No puedo soy macho");
        }else{
            System.out.println("He puesto un huevo!!");
        }
    }

    public void vuela(){
        System.out.println("Me voy volandoooo");
    }
}
