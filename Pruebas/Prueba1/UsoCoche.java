package Pruebas.Prueba1;
import javax.swing.*;

public class UsoCoche {
    public static void main(String[] args) {
        //INSTANCIAR UNA CLASE, RENAULT ES UN EJEMPLAR DE LA CLASE COCHE, SIENDO COCHE() EL NOMBRE DEL CONSTRUCTOR
        Coche coche = new Coche(); 

        System.out.print(coche.dimeDatosGenerales() + "\n");

        //Si no ponemos esto, solo tendríamos el atributo definido sin ningún valor, así lo establecemos
        coche.estableceColor(JOptionPane.showInputDialog("Dime el color del vehículo")); 
        System.out.print("\n" + coche.dimeColor());

        coche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asiento de cuero?"));
        System.out.print("\n" + coche.dimeAsientos());

        coche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.print("\n" + coche.dimeClimatizador());

        System.out.print("\n" + coche.dimePesoCoche());
        System.out.println("\n" + coche.configuraPrecioCoche());
    }
}
