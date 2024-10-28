import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Calculador de media de tres notas");
        System.out.println("-----------------------------");
        System.out.print("Dime la primera nota que has sacado: ");
        double nota1 = miScanner.nextDouble();
        miScanner.nextLine();
        if ((nota1 > 10) || (nota1 < 0)) {
            System.out.println("Ese número no esta entre 0 y el 10: " + nota1);
            System.out.print("Por favor introduce otra vez tu nota:  ");
            nota1 = miScanner.nextDouble();
            miScanner.nextLine();
        }
        System.out.print("Dime la segunda nota que has sacado: ");
        double nota2 = miScanner.nextDouble();
        miScanner.nextLine();
        if ((nota2 > 10) || (nota2 < 0)) {
            System.out.println("Ese número no esta entre 0 y el 10: " + nota2);
            System.out.print("Por favor introduce otra vez tu nota:  ");
            nota2 = miScanner.nextDouble();
            miScanner.nextLine();
        }
        System.out.print("Dime la tercera nota que has sacado: ");
        double nota3 = miScanner.nextDouble();
        miScanner.nextLine();
        if ((nota3 > 10) || (nota3 < 0)) {
            System.out.println("Ese número no esta entre 0 y el 10: " + nota1);
            System.out.print("Por favor introduce otra vez tu nota:  ");
            nota3 = miScanner.nextDouble();
            miScanner.nextLine();
        }

        double media = (nota1 + nota2 + nota3) / 3;
        int mediaentera = (int) media;

        switch (mediaentera) {
            case 0, 1, 2, 3, 4:
                System.out.println("Tu media da un insuficiente: " + mediaentera);
                break;
            case 5, 6:
                System.out.println("Tu media da un suficiente: " + mediaentera);
                break;
            case 7, 8:
                System.out.println("Tu media da un notable: " + mediaentera);
                break;
            case 9, 10:
                System.out.println("Tu media da un sobresaliente: " + mediaentera);
                break;
            default:
                System.out.println("Has fallado en algún número y no se puede hacer tu media: ");
                break;
        }

    }
}
