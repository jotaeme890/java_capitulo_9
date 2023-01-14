public class Gato extends Mamifero{
    private String nombre;
    private String color;
    private String raza;

    public Gato () {
        super(Sexo.MACHO);
    }

    public Gato(String nombre, String raza, String color){
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getColor(){
        return this.color;
    }

    public String getRaza(){
        return this.raza;
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
