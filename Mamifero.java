public abstract class Mamifero extends Animal {

    public Mamifero(){
        super();
    }   

    public Mamifero(Sexo s){
        super(s);
    }

    public void anda(){
        System.out.println("Estoy andando");
    }
    
    public void amamanta(){
        if(this.getSexo() == Sexo.MACHO) {
            System.out.println("No puedo amamantar, soy un macho");
        } else
        System.out.println("Estoy amamantando");
    }
}
