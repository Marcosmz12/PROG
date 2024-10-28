import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Indicador de horoscopo");
        System.out.println("----------------------");
        System.out.print("Por favor introduce el dia de tu cumpleaños: ");
        int dia = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Por favor introduce el mes de tu cumpleaños: ");
        String mes = miScanner.nextLine();

        switch (mes) {
            case "enero":
                if ((dia >= 1) && (dia < 20) ) {
                    System.out.println("Tu horóscopo es Capricornio");
                } else if ((dia >= 20) && (dia <= 31)){
                    System.out.println("Tu horóscopo es Acuario");
                }
                break;
            case "febrero":
                if ((dia >= 1) && (dia < 18) ) {
                    System.out.println("Tu horóscopo es Acuario");
                } else if ((dia >= 19) && (dia <= 28)){
                    System.out.println("Tu horóscopo es Piscis");
                }
                break;
            case "marzo":
                if ((dia >= 1) && (dia < 20) ) {
                    System.out.println("Tu horóscopo es Piscis");
                } else if ((dia >= 21) && (dia <= 31)){
                    System.out.println("Tu horóscopo es Aries");
                }
                break;
            
            default:
                break;
        }
    }
}
