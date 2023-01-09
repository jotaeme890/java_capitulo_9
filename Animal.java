public abstract class Animal {
    private Sexo sexo;

    public Animal(){
        this.sexo = Sexo.MACHO;
    }

    public Animal(Sexo s){
        this.sexo = s;
    }

    public Sexo getSexo() {
        return this.sexo;
    }
    
    public void dormir(){
        System.out.println("ZZZZZzzZzzZ");
    }

    public void comer (String comida){
        System.out.println("Que bueno está " + comida);
    }
}
