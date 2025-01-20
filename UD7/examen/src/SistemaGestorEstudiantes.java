import java.util.Scanner;

public class SistemaGestorEstudiantes {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println(YELLOW_BRIGHT + "SistemaGestorEstudiantes" + RESET);
        System.out.println("1. Agregar un estudiante");
        System.out.println("2. Agregar una nota a un estudiante.");
        System.out.println("3. Mostrar información de todos los estudiantes.");
        System.out.println("4. Mostrar estudiantes con promedio mayor a un valor.");
        System.out.println("5. Buscar un estudiante por su nombre.");
        System.out.println("6. Salir");
        System.out.println(RED_BRIGHT + "======================================================" + RESET);
        int opcion = pedirEntero(0);
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }

        mScanner.close();
    }

    public static int pedirEntero(int opciones) {
        int numero = 0;
        boolean numeroerronio = true;
        do {
            try {
                numero = Integer.parseInt(System.console().readLine());
                if (numero < 6) {
                    numeroerronio = false;
                } else {
                    System.out.println("La seleccion no puede ser mayor a 6");
                    numeroerronio = true;
                }
            } catch (Exception e) {
                System.out.println("Se ha equivocado en la seleccion ");
            }
        } while (numeroerronio);
        return numero;
    }
}
