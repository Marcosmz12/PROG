import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Introduzca un número porfavor: ");
        int numero = mScanner.nextInt();
        mScanner.nextLine();
        System.out.println("El ultimo número que has introducido es "+ (numero%10));
        mScanner.close();
    }
}
