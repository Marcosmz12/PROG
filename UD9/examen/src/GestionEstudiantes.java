import java.util.Scanner;

public class GestionEstudiantes {

    public static String registrarEstudiante() {
        String matricula = pedirCadena();
        String nombre = pedirCadena();
        int edad = pedirEntero();
        double promedio = pedirReal();
        Estudiante miEstudiante = new Estudiante(matricula, nombre, edad, promedio);
        return miEstudiante;
    }

    private static int pedirEntero() {
        int numero = 0;
        boolean numeroerronio = true;
        do {
            try {
                numero = Integer.parseInt(System.console().readLine());
                numeroerronio = false;
            } catch (Exception e) {
                System.out.println("Se ha equivocado en su edad ");
            }
        } while (numeroerronio);
        return numero;
    }

    private static String pedirCadena(){
        String cadena = "";
        boolean errorcadena = true;
        do {
            try {
                cadena = System.console().readLine();
                errorcadena = false;
            } catch (Exception e) {
                System.out.println("Se ha equivocado en su nombre o matricula ");
            }
        } while (errorcadena);
        return cadena;
    }

    private static double pedirReal(){
        Scanner mScanner = new Scanner(System.in);
        double promedio = 0;
        boolean errorpromedio = true;
        do {
            try {
                promedio = mScanner.nextDouble();
                mScanner.nextLine();
                errorpromedio = false;
            } catch (Exception e) {
                System.out.println("Se ha equivocado en su promedio");
            }
        } while (errorpromedio);
        return promedio;
    }
}
