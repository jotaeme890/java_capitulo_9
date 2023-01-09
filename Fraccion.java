public class Fraccion {
    private int signo;
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        if (d == 0) {
            System.out.println("Una fracción no puede tener como denominador el número 0");
        } else {
        if (n * d < 0) {
            this.signo = -1; //Negativo
        } else {
            this.signo = 1; //Positivo
        }
        this.numerador = Math.abs(n); //Pasamos todo a positivo
        this.denominador = Math.abs(d); //Pasamos todo a positivo
        }
    }

    int getNumerador(){
        return this.numerador;
    }

    int getDenominador(){
        return this.denominador;
    }

    public String toString() { //Para mostrar la fraccion
        if (signo == -1) {
            return "-" + this.numerador + "/" + this.denominador;
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }

    public Fraccion invierte() { //Le damos la vuelta
        return new Fraccion(this.signo * this.denominador, this.numerador);
    }
        
    public Fraccion multiplica(int n) { //Si solo introducen un número
        return new Fraccion(this.signo * this.numerador * n, this.denominador);
    }

    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador()); //Multiplicar 2 fracciones
    }

    public Fraccion divide(int n) {
        return new Fraccion(this.signo * this.numerador, this.denominador * n);
    }
    
    public Fraccion divide(Fraccion f) { //Dividir fraccion
        return new Fraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
    }
        
    public Fraccion simplifica() {
        int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;
        for (int i = 2; i <=/*POR SI HAY PRIMOS*/ Math.min(this.numerador, this.denominador); i++) {
            while (((n % i) == 0) && ((d % i) == 0)) {
                n /= i;
                d /= i;
            }
        }
        return new Fraccion(s * n, d);
    }
        
}
