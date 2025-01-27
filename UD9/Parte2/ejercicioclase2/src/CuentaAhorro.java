public class CuentaAhorro extends CuentaBancaria implements Operable {

    public CuentaAhorro(String numCuenta, double cantidad){
        super(numCuenta, cantidad);
    }

    
    @Override
    public double calculoIntereses() {
        return saldo = saldo * (tipoInteres / 100);
    }

    @Override
    public String mostrarResultado() {
        String ressultado = "El resultado es ";
        return ressultado + saldo;
    }
}
