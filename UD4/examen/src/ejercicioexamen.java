import java.util.Scanner;

public class ejercicioexamen {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.println("\033[42m ¡Bienvenido/a a la plataforma digital!\033[0m");

        System.out.print("\033[0mPor favor, dinos tu nombre: ");
        String nombre = mScanner.nextLine();
        System.out.print("Por favor, dinos tu edad: ");
        int edad = mScanner.nextInt();
        mScanner.nextLine();

        /* El iff sirve para si el usuario tiene menos de 18 se termina el programa */
        if (edad >= 18) {
            System.out.println("¡Gracias por registrarte, " + nombre + "!");
        } else if (edad < 18) {
            System.out.println("Lo siento no cumples con los requisitos de edad");
            System.exit(edad);
        }

        System.out.println("Selecciona el tipo de subcripción que deseas:");
        System.out.println("1. Básica - 10\u20ac");
        System.out.println("2. Estandar - 15\u20ac");
        System.out.println("3. Premium - 20\u20ac");
        int tiposubs = mScanner.nextInt();
        mScanner.nextLine();

        int preciosub = 0;
        String nombresub = "";
        double preciodescuento = 0;
        double preciofinal = 0;

        /*
         * El switch sirve para que el usuario elija el tipo de entrada y dependiendo de
         * su edad se le aplica un descuento o otro
         */
        switch (tiposubs) {
            case 1:
                nombresub = "Básica";
                preciosub = 10;
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre: " + nombre);
                if (edad <= 25) {
                    System.out.println("Descuento aplicado: 20%");
                    preciodescuento = preciosub * 0.20;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                } else if ((edad >= 26) && (edad <= 40)) {
                    System.out.println("Descuento aplicado: 10%");
                    preciodescuento = preciosub * 0.10;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                } else if (edad > 41) {
                    System.out.println("Descuento aplicado: Sin descuento");
                    preciofinal = preciosub;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println(
                            "\033[43m¡Gracias por unirte! Esperamos que disfrutes del contenido básico\033[0m");
                }
                break;
            case 2:
                nombresub = "Estandar";
                preciosub = 15;
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre: " + nombre);
                if (edad <= 25) {
                    System.out.println("Descuento aplicado: 20%");
                    preciodescuento = preciosub * 0.20;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                } else if ((edad >= 26) && (edad <= 40)) {
                    System.out.println("Descuento aplicado: 10%");
                    preciodescuento = preciosub * 0.10;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println(
                            "\033[43mBuena elección para disfrutar de contenido de calidad a un buen precio\033[0m");
                } else if (edad > 41) {
                    System.out.println("Descuento aplicado: Sin descuento");
                    preciofinal = preciosub;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                }
                break;
            case 3:
                nombresub = "Premium";
                preciosub = 20;
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre: " + nombre);
                if (edad <= 25) {
                    System.out.println("Descuento aplicado: 20%");
                    preciodescuento = preciosub * 0.20;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out
                            .println("\033[43m ¡Felicidades, estás aprovechando al máximo nuestra plataforma!\033[0m");
                } else if ((edad >= 26) && (edad <= 40)) {
                    System.out.println("Descuento aplicado: 10%");
                    preciodescuento = preciosub * 0.10;
                    preciofinal = preciosub - preciodescuento;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                } else if (edad > 41) {
                    System.out.println("Descuento aplicado: Sin descuento");
                    preciofinal = preciosub;
                    System.out.printf("Precio final: \033[1;31m%.2f\u20ac\033[0m \n", preciofinal);
                    System.out.println("\033[43mGracias por registrarte en nuestra plataforma.\033[0m");
                }
                break;
            default:
                System.out.println("No tenemos ese tipo de subcripcion");
                break;
        }
        mScanner.close();
    }
}