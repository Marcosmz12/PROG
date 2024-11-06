import java.util.Scanner;

public class ejercicioadicional {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Por favor introduzca el precio de la entrada general: ");
        double precio = mScanner.nextDouble();
        mScanner.nextLine();

        System.out.println("Que tipo de asiento tienes ¿?: ");
        System.out.println("-----------------------------");
        System.out.println("1.Palco");
        System.out.println("2.Gallinero");
        System.out.println("-----------------------------");
        int tipoasiento = mScanner.nextInt();
        mScanner.nextLine();
        switch (tipoasiento) {
            case 1:
                System.out.println("Has elegido el tipo de asiento palco");
                break;
            case 2:
                System.out.println("Has elegido el tipo de siento gallinero");
                break;
            default:
                System.out.println("No tenemos ese tipo de asiento " + tipoasiento);
                break;
        }
        System.out.println("Tipo de entrada");
        System.out.println("----------------");
        System.out.println("1.Invitacion");
        System.out.println("2.Local");
        System.out.println("3.Foraneo");
        System.out.println("----------------");
        int tipoentrada = mScanner.nextInt();
        mScanner.nextLine();
        double total = 0;
        switch (tipoentrada) {
            case 1:
                if (tipoasiento == 1) {
                    total = precio - (precio * 0.10);
                    System.out.printf(
                            "Usted tiene la entrada invitacion y asiento palco, y el precio de su entrada es: %.2f\n",
                            total, "€");
                } else if (tipoasiento == 2) {
                    total = precio - (precio * 0.05);
                    System.out.printf("Usted tiene la entrada invitacion y el precio de su entrada es: %.2f\n", total,
                            "€");
                }
                break;
            case 2:
                if (tipoasiento == 1) {
                    System.out.printf(
                            "Usted tiene la entrada Local y asiento palco, y el precio de su entrada es: %.2f\n",
                            precio, "€");
                } else if (tipoasiento == 2) {
                    System.out.printf("Usted tiene la entrada Local y el precio de su entrada es: %.2f\n", precio, "€");
                }
                break;
            case 3:
                if (tipoasiento == 1) {
                    total = precio + (precio * 0.10);
                    System.out.printf(
                            "Usted tiene la entrada Foraneo y asiento palco, y el precio de su entrada es: %.2f\n",
                            total, "€");
                } else if (tipoasiento == 2) {
                    total = precio + (precio * 0.05);
                    System.out.printf("Usted tiene la entrada Foraneo y el precio de su entrada es: %.2f\n", total,
                            "€");
                }
                break;
            default:
                System.out.println("Ese tipo de entrada no existe " + tipoentrada);
                break;
        }
        mScanner.close();
    }
}