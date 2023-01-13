import java.text.DecimalFormat;
public class TarjetaRegalo {
    private double saldo;
    private String numero;

    public TarjetaRegalo(double nuevoSaldo){
        this.saldo = nuevoSaldo;
        this.numero = "";

        for (int i = 0; i < 5; i++) {
            numero += (int)(Math.random()*10);
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    } 

    public void gasta(double d){
        if(this.saldo < d){
            System.out.println("No tiene suficiente saldo para gastar " + d + " euros");
        } else{
            saldo -= d;
        }
    }

    @Override
    public String toString(){
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + " euros";
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo otra){
        double nuevoSaldo = this.getSaldo() + otra.getSaldo();
        otra.setSaldo(0);
        this.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }
}
