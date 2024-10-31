import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Por favor introduce un número: ");
        int numero = miScanner.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("El número es par = " + numero);
        } else {
            System.out.println("El número es impar = " + numero);
        }

        if ((numero % 5) == 0) {
            System.out.println("El número es divisible entre 5 = " + numero);
        } else {
            System.out.println("El número no es divisible entre 5 = " + numero);
        }
        miScanner.close();
    }
}
