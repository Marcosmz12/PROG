public class Cuentacorriente extends CuentaBancaria implements Operable {

    public Cuentacorriente(String numCuenta, double cantidad) {
        super(numCuenta, cantidad);
    }

    @Override
    public double calculoIntereses() {
        double resultado = saldo * (tipoInteres / 100);
        System.out.println("Saldo: " + saldo + " x (Tipo de interés: " + tipoInteres + "/100)");
        return resultado;
    }

    @Override
    public void mostrarResultado() {
        double resultado = calculoIntereses();
        System.out.println("El resultado es: " + resultado);
    }
}
