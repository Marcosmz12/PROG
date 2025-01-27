public class GestionCuentas {
    public static void main(String[] args) throws Exception {
        CuentaBancaria[] miscuentas = new CuentaBancaria[5];
        miscuentas[0] = new Cuentacorriente("42mmz", 200.00);
        miscuentas[1] = new CuentaAhorro("0918ppc", 350);
        miscuentas[2] = new CuentaAhorro("27890ppl", 700);
        miscuentas[3] = new Cuentacorriente("27890ppl", 430);
        miscuentas[4] = new Cuentacorriente("27890ppl", 500);

        miscuentas[0].depositar(500);
        miscuentas[1].retirar(50);

        System.out.println("Cuentas Bancarias: ");
        System.out.println("===================");
        for (int i = 0; i < 5; i++) {
            System.out.println(miscuentas[i]);
            ((Operable) miscuentas[i]).calculoIntereses();
            ((Operable) miscuentas[i]).mostrarResultado();
            System.out.println("================");
        }
    }
}
