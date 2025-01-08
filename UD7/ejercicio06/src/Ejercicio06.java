import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        int[] numero = new int[15];

        System.out.println("Por favor introduzca 15 numeros : ");
        for (int i = 0; i < 15; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numero[i] = mScanner.nextInt();
        }

        int last = numero[14];
        for (int i = 14; i > 0; i--) {
            numero[i] = numero[i -1];
        }
        numero[0] = last;

        System.out.println("Numeros cambiando la posicion ");
        for (int i = 0; i < 15; i++) {
            System.out.println(i + " " + numero[i]);
        }

        mScanner.close();
    }
}
