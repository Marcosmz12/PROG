import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Digame la hora porfavor: ");
        int hora = miScanner.nextInt();
        miScanner.nextLine();

        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }
        if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenos tardes");
        }
        if (((hora >= 21) && (hora <= 24)) || ((hora >= 5) && (hora <= 0))) {
            System.out.println("Buenos noches");
        }
        if ((hora >= 24) && (hora <= 0)) {
            System.out.println("La hora introducida no es correcta");
        }
    }
}
