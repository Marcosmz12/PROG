import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Horario de clase");
        System.out.println("----------------");
        System.out.println("1.Lunes");
        System.out.println("2.Martes");
        System.out.println("3.Miercoles");
        System.out.println("4.Jueves");
        System.out.println("5.Viernes");
        System.out.println("----------------");
        System.out.print("Elige un dia de la semana: ");
        int opcion = miScanner.nextInt();
        miScanner.nextLine();

        String dia;
        String asignatura = "";
        switch (opcion) {
            case 1:
                dia = "Lunes";
                asignatura = "ENDES";
                System.out.println("El " + dia + " a primera toca " + asignatura);
                break;
            case 2:
                dia = "Martes";
                asignatura = "DASPGS";
                System.out.println("El " + dia + " a primera toca " + asignatura);
                break;
            case 3:
                dia = "Miercoles";
                asignatura = "LMSGI";
                System.out.println("El " + dia + " a primera toca " + asignatura);
                break;
            case 4:
                dia = "Jueves";
                asignatura = "LMSGI";
                System.out.println("El " + dia + " a primera toca " + asignatura);
                break;
            case 5:
                dia = "Viernes";
                asignatura = "BADAT";
                System.out.println("El " + dia + " a primera toca " + asignatura);
                break;
            case 6, 7:
                dia = "Sabado, Domingo";
                System.out.println("El " + dia + " no hay clase");
                break;
            default:
                dia = "No hay dia de la semana con ese numero";
                System.out.println(dia);
                break;
        }
    }
}