import java.util.Scanner;
import matematica.Digito;

public class ejercicio18 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("Dime un numero en binario: ");
        long binario = mScanner.nextInt();
        mScanner.nextLine();

        int bits = Digito.contadornumeros(binario);


        

    }
}
