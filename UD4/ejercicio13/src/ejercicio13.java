import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Digame un número porfavor: ");
        int numero1 = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Digame un número porfavor: ");
        int numero2 = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Digame un número porfavor: ");
        int numero3 = miScanner.nextInt();
        miScanner.nextLine();

        if ((numero1 >= numero2) && (numero2 >= numero3)) {
            System.out.print("Este es el orden de los tres numeros: " + numero1 + "," + numero2 + "," + numero3);
        } else if ((numero1 <= numero2) && (numero2 <= numero3)) {
            System.out.print("Este es el orden de los tres numeros: " + numero3 + "," + numero2 + "," + numero1);
        } else if ((numero1 <= numero2) && (numero2 >= numero3) && (numero3 >= numero1)) {
            System.out.print("Este es el orden de los tres numeros: " + numero2 + "," + numero3 + "," + numero1);
        } else if ((numero1 >= numero2) && (numero2 <= numero3) && (numero3 >= numero1)) {
            System.out.print("Este es el orden de los tres numeros: " + numero3 + "," + numero1 + "," + numero2);
        } else if ((numero1 >= numero2) && (numero2 <= numero3) && (numero3 <= numero1)) {
            System.out.print("Este es el orden de los tres numeros: " + numero1 + "," + numero3 + "," + numero2);
        } else if ((numero1 <= numero2) && (numero2 >= numero3) && (numero3 <= numero1)) {
            System.out.print("Este es el orden de los tres numeros: " + numero2 + "," + numero1 + "," + numero3);
        }
        miScanner.close();
    }
}
