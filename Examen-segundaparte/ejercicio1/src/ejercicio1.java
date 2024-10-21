import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        double millas = 0.621371;

        System.out.print("Ingrese la cantidad de kilómetros: ");
        double km = miScanner.nextDouble();
        miScanner.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.printf("Cantidad de kilómetros: %2.0f \n", km, "km");

        double resultado = km * millas;
        System.out.println("Equivalente en millas: \033[43m" + resultado + " mi");
        System.out.println("\033[0m------------------------------------------------\033[0m");
        System.out.println("La conversion se realizo utilizando la fórmula: ");
        System.out.println("\033[41m1 km \033[0m= \033[42m0.621371 mi \033[0m");

        // He realizado un conversor de km a millas con colores de fondo en los
        // resultados
    }
}
