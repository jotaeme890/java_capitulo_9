public class ClaseCaballo {
    private double altura;
    private double peso;
    private String raza;
    private String color;
    private String sexo;
    private String nombre;

    public ClaseCaballo(String nombre){
        this.nombre = nombre;
    }

    public void setDatos(double altura, double peso, String raza, String color, String sexo){
        this.altura = altura;
        this.peso = peso;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
    }

    public void corre(){
        System.out.println(this.nombre + " está corriendo");
    }

    public void salta(){
        System.out.println(this.nombre + " va a saltar");
    }

    public void come(){
        System.out.println("Qué bueno, dame más comida por favor");
    }

    public void relincha(){
        System.out.println("híiiiiiiiii");
    }

    public String toString() {
        String texto = "";
        texto += "Nombre:  " + this.nombre;
        texto += "\nPeso:    " + this.peso + "Kg";
        texto += "\nSexo:    " + this.sexo;
        texto += "\nRaza:    " + this.raza;
        texto += "\nColor:   " + this.color;
        texto += "\nAltura:  " + this.altura + "m";
        return texto;
    }
}
