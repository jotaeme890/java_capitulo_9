package PrimerContacto;
public class GatoSimple{
    //Le añadimos los atributos
    String color, raza,sexo;
    int edad;
    double peso;

    //En este caso, solo queremos poner el valor inicial del sexo, por lo que haremos el constructor:
    public GatoSimple(String sexo){
        this.sexo = sexo;
    }

    //Getter de sexo
    String dimeSexo(){
        return sexo;
    }

    //Haremos que el gato maulle:
    void gatoMaulla(){
        System.out.println("Miaaaauuuuu");
    }

    //Haremos que el gato ronronee:
    void gatoRonronea(){
        System.out.println("mmmrrrrrr");
    }

    //Haremos que el gato coma,SOLO LE GUSTA EL PESCADO:
    void gatoCome(String alimento){
        if(alimento.equals("pescado")){
            System.out.println("Esto me gusta, muchas gracias");
        } else{
            System.out.println("No gracias, solo como pescado");
        }
    }

    //Haremos que el gato pelee, siendo eel contrincante un objeto dee tipo GatoSimple:
    void gatoPelea(GatoSimple contrincante){
        if(this.sexo.equals("hembra")){
            System.out.println("Lo siento, no me gusta luchar");
        } else{
            if(contrincante.dimeSexo().equals("hembra")){
                System.out.println("Lo siento, no peleo contra gatas");
            } else{
                System.out.println("Vamos a pelear");
            }
        }
    }
}