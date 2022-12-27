package PrimerContacto;
public class Cuadrado {
    int lado;

    public Cuadrado(int l) {
        this.lado = l;
    }

    //IMPLEMENTAMOS LA CALSE toString QUE LO QUE HACE ES LO QUE SE DEVUELVE COMO RETURN LO PASA A UN STRING 
    public String toString() {
        int i, espacios;
        String resultado = "";

        for (i = 0; i < this.lado; i++) {
            resultado += "[][]";
        }
        resultado += "\n";

        for (i = 1; i < this.lado - 1; i++) {
            resultado += "[][]";

            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += "  ";
            }
            
            resultado += "[][]\n";
        }

        for (i = 0; i < this.lado; i++) {
            resultado += "[][]";
        }
        resultado += "\n";
        return resultado;
    }
}
