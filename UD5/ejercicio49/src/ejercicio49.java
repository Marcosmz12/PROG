import java.util.Scanner;

public class ejercicio49 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo");
        int numerointroducido = mScanner.nextInt();

        int contador = 0;
        int numeromaximo = numerointroducido;
        int numerominimo = numerointroducido;

        while (!esPrimo(numerointroducido)) {
            numerointroducido = mScanner.nextInt();
            contador++;
            
            if (!esPrimo(numerointroducido)) {
                if (numerointroducido > numeromaximo) {
                    numeromaximo = numerointroducido;
                }
            }

            if (!esPrimo(numerointroducido)) {
                if (numerointroducido < numerominimo) {
                    numerominimo = numerointroducido;
                }
            }
        }
        System.out.println("Ha introducido " + contador + " números no primos.");
        System.out.println("Numero maximo: " + numeromaximo);
        System.out.println("Numero minimo: "+ numerominimo);
        mScanner.close();
    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}