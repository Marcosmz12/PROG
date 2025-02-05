import java.util.Scanner;

public class GestrodePersonas {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        GestorPersonas mGestorPersonas = new GestorPersonas();
        int opcion;

        do {
            System.out.println("Registro de Personas: ");
            System.out.println("======================");
            System.out.println("1. Añadir Personas.");
            System.out.println("2. Eliminar por color de pelo.");
            System.out.println("3. Eliminar Persona.");
            System.out.println("4. Mostrar por color de pelo.");
            System.out.println("5. Mostrar todo.");
            System.out.println("6. Salir.");
            System.out.println("======================");
            System.out.print("Elija su opcion: ");
            opcion = pedirEntero(0);

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = mScanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = mScanner.nextInt();
                    mScanner.nextLine();
                    System.out.print("Color de pelo: ");
                    String colordepelo = mScanner.nextLine();
                    Persona mPersona = new Persona(nombre, edad);
                    mGestorPersonas.añadirPersona(colordepelo, mPersona);
                    break;
                case 2:
                    System.out.println("Color de pelo que quiere eliminar");
                    colordepelo = mScanner.nextLine();
                    mGestorPersonas.eliminarColordePelo(colordepelo);
                    break;
                case 3:
                    System.out.println("Persona que quiere eliminar:");
                    System.out.println("Nombre: ");
                    String nombrePersona = mScanner.nextLine();
                    System.out.println("Edad: ");
                    int edadPersona = mScanner.nextInt();
                    mScanner.nextLine();
                    Persona personaEliminada = new Persona(nombrePersona, edadPersona);
                    System.out.println("Color de pelo: ");
                    String colorDepelo = mScanner.nextLine();
                    mGestorPersonas.borrarPersona(colorDepelo, personaEliminada);
                    break;
                case 4:
                    System.out.println("Color de pelo: ");
                    String colorDePelo = mScanner.nextLine();
                    mGestorPersonas.mostrarColordePelo(colorDePelo);
                    break;
                case 5:
                    mGestorPersonas.mostrarPersonas();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
            }
        } while (opcion != 6);

        mScanner.close();
    }

    public static int pedirEntero(int opcion) {
        int numero = 0;
        boolean numeroerroimio = false;
        do {
            try {
                numero = Integer.parseInt(System.console().readLine());
                if (numero < 6) {
                    numeroerroimio = false;
                }
            } catch (Exception e) {
                System.out.println(RED_BRIGHT+ "Se ha equivocado en la seleccion." + RESET);
            }
        } while (numeroerroimio);
        return numero;
    }
}