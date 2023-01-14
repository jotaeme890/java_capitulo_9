public class Ejercicio15 {
    public static void main(String[] args) {
        int cuentaFichas = 0;
        //Creamos un array de Fichas de domino para poder hacer el control de todas
        FichaDomino[] fichas = new FichaDomino[8];
        //Para crear una ficha de domino con los datos aleatorios
        fichas[0] = new FichaDomino();

        for (int i = 1; i < 8; i++) {
            FichaDomino aux;
            do {
                aux = new FichaDomino();
                //Sale del do while, cuando ve que la ficha en la posición anterior a la que está encaja con la siguiente,
                // se usa el aux, como ficha siguiente ya que se rellena con valores aleatorios
            } while (!fichas[i - 1].encajaEnFila(aux));
            //Una vez comprobado que encaja, se mete en el array
            fichas[i] = aux;
        }

        for (FichaDomino ficha : fichas) {
            System.out.print(ficha);    
        }
    }
}
