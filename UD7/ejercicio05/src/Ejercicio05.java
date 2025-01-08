import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int[] n = new int[11];
        int maximo ;
        int minimo ;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un numero por favor : ");
            n[i] = mScanner.nextInt();
            mScanner.nextLine();
        }
        maximo = n[0];
        minimo = n[0];

        for (int i = 0; i < 10; i++) {
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
