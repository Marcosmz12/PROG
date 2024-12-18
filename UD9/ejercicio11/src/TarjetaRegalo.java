import java.text.DecimalFormat;

public class TarjetaRegalo {
    private String numeroTarjeta;
    private double saldo;
    private double gasto;

    TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numeroTarjeta = generarNumero();
    }

    public void gasta(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("No tiene suficiente saldo para gastar " + cantidad);
        }
    }

    private String generarNumero() {
        String id = "";
        for (int i = 0; i < 5; i++) {
            int cifra = (int) (Math.random() * 10);
            id += Integer.toString(cifra);
        }
        return id;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double saldonuevo = this.saldo + t.getSaldo();
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(saldonuevo);
    }

    double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double miSaldo) {
        this.saldo = miSaldo;
    }

    double getGasto() {
        return this.gasto;
    }

    public String toString() {
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta nº " + this.numeroTarjeta + " - " + dosDecimales.format(saldo) + "$";
    }
}