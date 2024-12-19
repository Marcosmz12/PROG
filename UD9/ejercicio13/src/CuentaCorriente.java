public class CuentaCorriente {
    private double saldo = 0;
    private String numeroCuenta;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.numeroCuenta = generarNumero();
    }

    private String generarNumero() {
        String id = "";
        for (int i = 0; i < 10; i++) {
            int cantidad = (int) (Math.random() * 10);
            id += Integer.toString(cantidad);
        }
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Número de cta: " + numeroCuenta + " Saldo: " + saldo;
    }

    public void ingreso(int dinero) {
        saldo += dinero;
    }

    public void cargo(int dinero) {
        saldo -= dinero;
    }

    public void transferencia(CuentaCorriente cuentaDestino, int dinero) {
        saldo -= dinero;
        cuentaDestino.saldo += dinero;
    }

}
