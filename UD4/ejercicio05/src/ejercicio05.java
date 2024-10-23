import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduce el valor de a: ");
        double a = miScanner.nextDouble();
        miScanner.nextLine();
        System.out.print("Ahora, introduce el valor de b: ");
        double b = miScanner.nextDouble();
        miScanner.nextLine();

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }
}
