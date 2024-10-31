import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Por favor digame la hora: ");
        int hora = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Por favor digame los minutos: ");
        int minutos = miScanner.nextInt();
        miScanner.nextLine();

        int medianocheh = 23;
        int medianochem = 60;
        int resultado1 = medianocheh - hora;
        int resultado2 = medianochem - minutos;

        if ((resultado2 == 60)) {
            resultado2 = 0;
            resultado1 = resultado1 + 1;
            System.out.println("Queda hasta media noche " + resultado1 + ":" + resultado2);
        } else if ((resultado2 < 60)) {
            System.out.println("Queda hasta media noche " + resultado1 + ":" + resultado2);
        }
        miScanner.close();
    }
}