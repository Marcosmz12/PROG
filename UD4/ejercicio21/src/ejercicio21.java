import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Dime la nota de tu primer examen: ");
        double examen1 = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.print("Dime la nota de tu segundo examen: ");
        double examen2 = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.println("---------------------------------");

        double media = (examen1 + examen2) / 2;
        String recuperacion = "";

        if (media >= 5) {
            System.out.printf("Tu nota media es: %.2f\n", media);
        } else if (media < 5) {
            System.out.printf("Tu nota media es: %.2f\n", media);
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperacion = mScanner.nextLine();
            if (recuperacion.equals("apto")) {
                media = 5;
                System.out.printf("Tu media es: %.2f\n", media);
            }
            if (recuperacion.equals("no apto")) {
                System.out.printf("Tu media es: %.2f\n", media);
            }
        }

        mScanner.close();
    }
}
