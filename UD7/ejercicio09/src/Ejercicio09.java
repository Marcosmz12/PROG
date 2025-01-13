import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[9];

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduzca 8 numeros : ");
            n[i] = mScanner.nextInt();
            mScanner.nextLine();
        }

        System.out.println("Indicador de numeros pares e impares :");
        for (int i = 0; i < 8; i++) {
            System.out.print(n[i]);
            if (n[i] % 2 == 0) {
                System.out.print(" es par");
            } else {
                System.out.print(" es impar");
            }
            System.out.println();
        }

        mScanner.close();
    }
}
