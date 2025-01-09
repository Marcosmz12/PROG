import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[10];
        int ultimaPos = 0;
        System.out.println("Por favor introduzca 10 numeros : ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            n[i] = mScanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "-" + n[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n.length; i++) {
            if (Esprimo.esPrimo(n[i])) {
                Desplazo.desplazar(n, i, ultimaPos);
                ultimaPos++;
                System.out.print(i + "-" + n[i] + " ");
            }
        }

        mScanner.close();
    }
}
