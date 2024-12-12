import matematica.Esprimo;

public class ejercicio15 {
    public static void main(String[] args) throws Exception {
        int primos = 100;
        for (int i = 0; i < primos ; i++){
            if (Esprimo.esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
