public class CuentaCorriente {
    private String numeroC = "";
    private int saldo;

    public CuentaCorriente(){
        this.numeroCuenta();
    }

    public CuentaCorriente(int saldo){
        this.numeroCuenta();
        this.saldo = saldo;
    }

    private void numeroCuenta(){
        for (int i = 0; i < 10; i++) {
            numeroC += (int) (Math.random()*10); 
        }
    }

    @Override 
    public String toString() {
        return "Número de cta: " + numeroC + " Saldo: " + String.format("%.2f", saldo) + " euros";
    }

    public void ingreso(int dinero){
        saldo += dinero;
    }

    public void cargo(int dinero){
        saldo -= dinero;
    }

    public void transferencia(CuentaCorriente x, int dinero){
        this.cargo(dinero);
        x.ingreso(dinero);
    }
}
