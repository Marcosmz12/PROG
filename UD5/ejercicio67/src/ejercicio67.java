import java.util.Scanner;

public class ejercicio67 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Introduzca el número de escalones: ");
        int escalones = mScanner.nextInt();
        mScanner.nextLine();
        System.out.print("Introduzca la altura de cada escalón:");
        int altura = mScanner.nextInt();
        mScanner.nextLine();

        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j <= altura ;j++){
                for (int k = 0;k < i ; k++ ){
                    System.out.print("****");
                }
                System.out.println();
            }
        }
        mScanner.close();
    }
}
