public class CuentaAhorro extends CuentaBancaria implements Operable {

    public CuentaAhorro(String numCuenta, double cantidad){
        super(numCuenta, cantidad);
    }

    
    @Override
    public double calculoIntereses() {
        double resultado = saldo * (tipoInteres / 100);
        System.out.println("saldo " + saldo + "x(tipo de intereses: " + tipoInteres + "/" + 100);
        return resultado;
    }

    @Override
    public void mostrarResultado() {
        String ressultado = "El resultado es ";
        System.out.println(ressultado + saldo);
    }
}
