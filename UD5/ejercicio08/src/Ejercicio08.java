import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un numero y te muestro su tabla de multiplicar: ");
        numero = mScanner.nextInt();
        mScanner.nextLine();

        for (int multi = 0; multi <= 10; multi++) {
            System.out.println(numero + " x " + multi + " = " + numero * multi);
        }
        mScanner.close();
    }
}
