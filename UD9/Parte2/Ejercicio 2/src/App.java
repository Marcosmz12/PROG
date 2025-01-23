import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int km;

        Bicicleta montybike = new Bicicleta(10);
        Coche peugeto206xs = new Coche(1600);
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8): ");
        int opcion = mScanner.nextInt();
        mScanner.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                km = mScanner.nextInt();
                mScanner.nextLine();
                montybike.recorre(km);
                break;
            case 2:
                montybike.hazCaballito();
                break;
            case 3:
                System.out.print("¿Cuántos kilómetros quiere recorrer?");
                km = mScanner.nextInt();
                mScanner.nextLine();
                peugeto206xs.recorre(km);
                break;
            case 4:
                peugeto206xs.qumaRueda();
                break;
            case 5:
                System.out.println("La bicicleta lleva recorridos ");
                System.out.println(montybike.getKilometrosRecorridos() + "Km");
                break;
            case 6:
                System.out.println("El coche lleva recorridos ");
                System.out.println(peugeto206xs.getKilometrosRecorridos() + "Km");
                break;
            case 7:
                System.out.println("Los vehiculos llevan recorriods ");
                System.out.println(Vehiculos.getKilometrosTotales() + "Km");
            default:
                break;

        }

        mScanner.close();
    }
}
