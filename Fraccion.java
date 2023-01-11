public class Fraccion implements Cloneable{
    private int numerador;
    private int denominador;

    public Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int n, int d) {
        this();
        if (d == 0) {
            System.out.println("Una fracción no puede tener como denominador el número 0");
        } else {
            this.numerador = Math.abs(n); //Pasamos todo a positivo
            this.denominador = Math.abs(d); //Pasamos todo a positivo
        }
    }

    public Fraccion(Fraccion f){
        this(f.getNumerador(), f.getDenominador());
    }

    int getNumerador(){
        return this.numerador;
    }

    int getDenominador(){
        return this.denominador;
    }

    @Override
    public Fraccion clone(){
        return new Fraccion(this.numerador, this.denominador);
    }

    @Override
    public String toString() { //Para mostrar la fraccion
        boolean negativo = (this.numerador < 0 || this.denominador < 0) && !(this.denominador < 0 && this.numerador < 0);
        return (negativo?"-":"") + Math.abs(this.numerador) + "/" + Math.abs(this.denominador);
    }

    public Fraccion invierte() { //Le damos la vuelta
        return new Fraccion(this.denominador, this.numerador);
    }
        
    public Fraccion multiplica(int n) { //Si solo introducen un número
        return new Fraccion(this.numerador * n, this.denominador);
    }

    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador()); //Multiplicar 2 fracciones
    }

    public Fraccion divide(int n) {
        return this.divide(new Fraccion(n,1));
    }
    
    public Fraccion divide(Fraccion f) { //Dividir fraccion
        return this.multiplica(f.invierte());
    }
        
    public Fraccion simplifica() {
        int n = this.numerador;
        int d = this.denominador;
        for (int i = 2; i <=/*POR SI HAY PRIMOS*/ Math.abs(Math.min(this.numerador, this.denominador)) && i<=n && i<=d; i++) {
            if (n % Math.abs(i) == 0 && d % Math.abs(i) == 0) {
                n /= i;
                d /= i;
            }
        }
        return new Fraccion(n, d);
    }
}
