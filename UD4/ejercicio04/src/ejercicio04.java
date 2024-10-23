import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Dime el numero de horas trabajadas: ");
        int hora = miScanner.nextInt();
        miScanner.nextLine();

        int salario;
        if ((hora <= 40)) {
            salario = hora * 12;
            System.out.println("El sueldo semanal es " + salario + "€");
        }
        if ((hora > 40)) {
            salario = hora * 16;
            System.out.printf("El sueldo semanal es " + salario + "€");
        }
    }
}
