import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Porfavor introduce el caracter para la piramide: ");
        String caracter = miScanner.nextLine();
        System.out.print("Elige a que lado quieres la piramide: ");
        String lado = miScanner.nextLine();
        System.out.println("---------------------------------------");
        switch (lado) {
            case "arriba":
                System.out.println("          " + caracter);
                System.out.println("         " + caracter + " " + caracter);
                System.out.println("        " + caracter + " " + caracter + " " + caracter);
                System.out.println("       " + caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(
                        "      " + caracter + " " + caracter + " " + caracter + " " + caracter + " " + caracter);
                break;
            case "abajo":
                System.out.println(
                        "      " + caracter + " " + caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println("       " + caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println("        " + caracter + " " + caracter + " " + caracter);
                System.out.println("         " + caracter + " " + caracter);
                System.out.println("          " + caracter);
                break;
            case "derecha":
                System.out.println(caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter);
                break;
            case "izquierda":
                System.out.println(" " + " " + " " + " " + " " + " " + " " + caracter);
                System.out.println(" " + " " + " " + " " + " " + caracter + " " + caracter);
                System.out.println(" " + " " + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(" " + caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(" " + " " + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(" " + " " + " " + " " + " " + caracter + " " + caracter);
                System.out.println(" " + " " + " " + " " + " " + " " + " " + caracter);
                break;
            default:
            System.out.println("te has equivocado socio");
                break;
        }
        miScanner.close();
    }
}
