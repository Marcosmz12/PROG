import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int combinacion = 0;
        int oportunidades = 4; 
        boolean acertado = false;
        
        do{
            System.out.print("Introduzca la combinacion de la caja fuerte: ");
            combinacion = mScanner.nextInt();
            mScanner.nextLine();

            if (combinacion == 4925) {
                acertado = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación =(");
            }
        } while ((oportunidades > 0) && (!acertado));

        if (acertado) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
        mScanner.close();
    }
}
