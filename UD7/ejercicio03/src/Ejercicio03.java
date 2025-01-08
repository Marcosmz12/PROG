import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[11];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digame un numero por favor: ");
            n[i] = mScanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(n[i]);
        }

        mScanner.close();
    }
}
