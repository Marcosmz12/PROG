import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        double pi = 3.14;
        double radio2;
        double resultado;

        
        System.out.println("\033[1;30m ÁREA DE UN CÍRCULO");
        System.out.println("\033[0m --------------------");
        System.out.println("\033[0m --------------------");
        System.out.print("Introduzca el radio (cm): ");
        double radio = miScanner.nextDouble();

        radio2 = radio *2;
        resultado = radio2 * pi;
        System.out.println("El área del círculo es: \033[1;31m"+ resultado + "\033[0m cm\u00B2");
//El codigo te calcula el radio de un circulo 
    }
}
