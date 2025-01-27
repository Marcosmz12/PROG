public abstract class CuentaBancaria {
    protected String numCuenta;
    protected double tipoInteres = 0.5;
    protected double saldo;

    public CuentaBancaria(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public double depositar(double cantidad) {
        return saldo += cantidad;
    }

    public double retirar(double cantidadAretirar) {
        return saldo -= cantidadAretirar;
    }

    @Override
    public String toString() {
        return "Nº Cuenta: " + numCuenta + " saldo: " + saldo + "€" + " " + "intereses: " + tipoInteres;
    }
}