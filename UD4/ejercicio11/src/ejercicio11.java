import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Por favor digame la hora: ");
        int hora = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Por favor digame los minutos: ");
        double minutos = miScanner.nextDouble();
        miScanner.nextLine();

        double medianoche = 23.60;
        double resultado = medianoche - hora + minutos;
        if ( (minutos == 60)){
            minutos = 0;
            System.out.printf("Queda hasta medianoche ");
        } else {
            
        }
    }
}
