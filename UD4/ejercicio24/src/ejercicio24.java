import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.println("----------------------");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int empleado = mScanner.nextInt();
        mScanner.nextLine();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int viaje = mScanner.nextInt();
        mScanner.nextLine();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estado = mScanner.nextInt();
        mScanner.nextLine();

        double sueldo = 0;
        double dieta = viaje * 30;
        double soltero = 0;
        double casado = 0;

        switch (empleado) {
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;

            default:
                System.out.println("Ese cargo no esta entre los seleccionados");
                break;
        }
        double sueldobruto = sueldo + dieta;

        System.out.println("----------------------------------");
        if ((empleado == 1) || (empleado == 2) || (empleado == 3)) {
            System.out.printf("|Sueldo base: %19.2f|\n", sueldo);
        } else{
            System.out.println("|No existe ese cargo");
        }
        if (viaje > 0) {
            System.out.printf("|Dietas: %24.2f|\n", dieta);
        }
        System.out.println("|--------------------------------|");
        if ((empleado == 1) || (empleado == 2) || (empleado == 3)) {
            System.out.printf("|Sueldo bruto %19.2f|\n", sueldobruto);
        }

        if (estado == 1) {
            soltero = sueldobruto * 0.20;
            System.out.printf("|Retención IRPF (20%%) %11.2f|\n", soltero);
        } else if (estado == 2) {
            casado = sueldobruto * 0.25;
            System.out.printf("|Retención IRPF (25%%) %11.2f|\n", casado);
        }
        System.out.println("|--------------------------------|");

        double sueldoneto = 0;

        if (estado == 1) {
            sueldoneto = sueldobruto - soltero;
            System.out.printf("|Sueldo neto %20.2f|\n", sueldoneto);
        } else if (estado == 2) {
            sueldoneto = sueldobruto - casado;
            System.out.printf("|Sueldo neto %20.2f|\n", sueldoneto);
        }
        System.out.println("|--------------------------------|");

        mScanner.close();
    }
}
