import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("Introduce 10 numeros porfavor");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Nº" +i + ": " );
            int numerosIntroducidos = mScanner.nextInt();
            mScanner.nextLine();
            numeros.add(numerosIntroducidos);
        }
        
        System.out.println("Lista original: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);

        mScanner.close();
    }
}
