import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        String pitufo = "";

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = mScanner.nextLine();
        System.out.print("¿Qué ha tomado de beber? (zumo o cafe):");
        String bebida = mScanner.nextLine();

        switch (comida) {
            case "palmera":
                double palmera = 1.40;
                System.out.printf("Palmera: %.2f €\n", palmera);
                break;
            case "donut":
                double donut = 1;
                System.out.printf("Palmera: %.2f €\n", donut);
                break;
            case "pitufo":
                System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
                pitufo = mScanner.nextLine();
                if (pitufo.equals("aceite")) {
                    double aceite = 1.20;
                    System.out.printf("Pitufo con aceite: %.2f €\n", aceite);
                } else if (pitufo.equals("tortilla")) {
                    double tortilla = 1.60;
                    System.out.printf("Pitufo con tortilla: %.2f €\n", tortilla);
                }
                break;
            default:
            System.out.println("No tenemos ese producto");
                break;
            }
        
        switch (bebida) {
            case "zumo":
            double zumo = 1.50;
            System.out.printf("Palmera: %.2f €\n", zumo);
                break;
                case "cafe":
                double cafe = 1.20;
                System.out.printf("Palmera: %.2f €\n", cafe);
                    break;
            default:
            System.out.println("No tenemos ese producto");
                break;
        }
        mScanner.close();

    }
}
