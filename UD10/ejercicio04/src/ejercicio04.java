import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        ArrayList<String> letras = new ArrayList<String>();

        System.out.println("Introduce 10 letras");
        for (int i = 0; i < 10; i++) {
            System.out.println("Letra nº" + i);
            String letraIntroducida = mScanner.nextLine();
            letras.add(letraIntroducida);
        }

        System.out.println("Lista original: " + letras);
        Collections.sort(letras);
        System.out.println("Lista ordenada: " + letras);

        mScanner.close();

    }
}
