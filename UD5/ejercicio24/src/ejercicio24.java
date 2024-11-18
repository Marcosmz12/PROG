import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner miS = new Scanner(System.in);
        System.out.print("Por favor introduce un numero para tu piramide : ");
        int numerointroducido = miS.nextInt();
        miS.nextLine();

        int alturapiramide = 1;
        int caracter = 0;
        int espacios = numerointroducido - 1;

        while (alturapiramide <= numerointroducido) {

            for (caracter = 1; caracter <= espacios; caracter++) {
                System.out.print(" ");
            }

            for (caracter = 1; caracter < alturapiramide; caracter++) {
                System.out.print(caracter);
            }

            for (caracter = alturapiramide; caracter > 0; caracter--) {
                System.out.print(caracter);
            }

            System.out.println();

            alturapiramide++;
            espacios--;
        }
        miS.close();
    }
}
