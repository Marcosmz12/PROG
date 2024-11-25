import java.util.Scanner;
import java.util.regex.Pattern;

public class ejercicioexamen {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        int oportunidades = 3;

        for (int oportu = 0; oportu < oportunidades; oportu++) {
            System.out.print("Ingrese una contraseña: ");
            String contrasena = mScanner.nextLine();
        }
        System.out.println("\033[0;93mNúmero máximo de intentos alcanzado.\033[0m");

        mScanner.close();
    }
}