import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduzca 10 números por favor");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + " : ");
            n[i] = mScanner.nextInt();
            mScanner.nextLine();

            if (n[i] > maximo) {
                maximo = n[i];
            }

            if (n[i] < minimo) {
                minimo = n[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(n[i]);

            if (n[i] == maximo) {
                System.out.print(" maximo");
            }

            if (n[i] == minimo) {
                System.out.print(" minimo");
            }
            System.out.println();
        }

        mScanner.close();
    }
}
