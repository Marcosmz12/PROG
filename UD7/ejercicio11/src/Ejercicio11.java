import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Por favor introduzca 10 numeros : ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            n[i] = mScanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " " + n[i]);
        }

        mScanner.close();
    }
}
