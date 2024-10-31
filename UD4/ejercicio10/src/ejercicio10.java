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
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Tu horóscopo es Capricornio");
                } else if ((dia >= 21) && (dia <= 31)) {
                    System.out.println("Tu horóscopo es Acuario");
                }
                break;
            case "febrero":
                if ((dia >= 1) && (dia <= 18)) {
                    System.out.println("Tu horóscopo es Acuario");
                } else if ((dia >= 19) && (dia <= 28)) {
                    System.out.println("Tu horóscopo es Piscis");
                }
                break;
            case "marzo":
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Tu horóscopo es Piscis");
                } else if ((dia >= 21) && (dia <= 31)) {
                    System.out.println("Tu horóscopo es Aries");
                }
                break;
            case "abril":
                if ((dia >= 1) && (dia <= 19)) {
                    System.out.println("Tu horóscopo es Aries");
                } else if ((dia >= 20) && (dia <= 30)) {
                    System.out.println("Tu horóscopo es Tauro");
                }
                break;
            case "mayo":
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Tu horóscopo es Tauro");
                } else if ((dia >= 21) && (dia <= 31)) {
                    System.out.println("Tu horóscopo es Geminis");
                }
                break;
            case "junio":
                if ((dia >= 1) && (dia <= 20)) {
                    System.out.println("Tu horóscopo es Geminis");
                } else if ((dia >= 21) && (dia <= 30)) {
                    System.out.println("Tu horóscopo es Cancer");
                }
                break;
            case "julio":
                if ((dia >= 1) && (dia <= 23)) {
                    System.out.println("Tu horóscopo es Cancer");
                } else if ((dia >= 23) && (dia < 30)) {
                    System.out.println("Tu horóscopo es Leo");
                }
                break;
            case "agosto":
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Tu horóscopo es Leo");
                } else if ((dia >= 23) && (dia < 31)) {
                    System.out.println("Tu horóscopo es Virgo");
                }
                break;
            case "septiembre":
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Tu horóscopo es Virgo");
                } else if ((dia >= 23) && (dia < 30)) {
                    System.out.println("Tu horóscopo es Libra");
                }
                break;
            case "octubre":
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Tu horóscopo es Libra");
                } else if ((dia >= 23) && (dia < 31)) {
                    System.out.println("Tu horóscopo es Escorpio");
                }
                break;
            case "noviembre":
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Tu horóscopo es Escorpio");
                } else if ((dia >= 22) && (dia < 30)) {
                    System.out.println("Tu horóscopo es Sagitario");
                }
                break;
            case "diciembre":
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Tu horóscopo es Sagitario");
                } else if ((dia >= 22) && (dia < 31)) {
                    System.out.println("Tu horóscopo es Capricornio");
                }
                break;
            default: 
                System.out.print("Te has equivocado " + dia +" "+ mes);
                break;
        }
        miScanner.close();
    }
}
