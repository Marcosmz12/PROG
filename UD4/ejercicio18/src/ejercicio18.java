import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int numero;
        int primer = 0;

        System.out.print("Introduzca un número por favor: ");
        numero = mScanner.nextInt();
        mScanner.nextLine();

        if (numero < 10) {
            primer = numero;
        } else if ((numero >= 10) && (numero <= 100)){
            primer = numero / 10; 
        } else if ((numero >= 100) && (numero <= 1000)) {
            primer = numero / 100;
        }else if ((numero >= 1000) && (numero <= 10000)) {
            primer = numero / 1000;
        }else if (numero >= 10000) {
            primer = numero / 10000;
        }

        System.out.println("La primera cifra de tu numero es: " + primer);
        mScanner.close();
    }
}
