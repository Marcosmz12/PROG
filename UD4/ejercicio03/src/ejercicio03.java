import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Digame un numero del dia de la semana: ");
        int numero = miScanner.nextInt();
        miScanner.nextLine();

        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                System.out.println("Hoy es " + dia);
                break;
            case 2:
                dia = "Martes";
                System.out.println("Hoy es " + dia);
                break;
            case 3:
                dia = "Miercoles";
                System.out.println("Hoy es " + dia);
                break;
            case 4:
                dia = "Jueves";
                System.out.println("Hoy es " + dia);
                break;
            case 5:
                dia = "Viernes";
                System.out.println("Hoy es " + dia);
                break;
            case 6:
                dia = "Sabado";
                System.out.println("Hoy es " + dia);
                break;
            case 7:
                dia = "Domingo";
                System.out.println("Hoy es " + dia);
                break;
            default:
                System.out.println("El numero no coincide con ningun dia de la semana");
                break;
        }

    }
}
