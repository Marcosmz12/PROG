import java.util.Scanner;

public class Gestionvehiculos {
    public static void main(String[] args) throws Exception {
        Vehiculo[] mVehiculo = new Vehiculo[5];

        mVehiculo[0] = new Coche(12000, 2020, 5);
        mVehiculo[1] = new Coche(20000, 2025, 3);
        mVehiculo[2] = new Coche(30000, 2024, 5);
        mVehiculo[3] = new Camion(30000, 2024, 1200);
        mVehiculo[4] = new Camion(30000, 2024, 1500);

        for (int i = 0; i < mVehiculo.length; i++) {
            System.out.println(mVehiculo[i]);
            ((Asegurable) mVehiculo[i]).mostrarDetalles();
            ((Asegurable) mVehiculo[i]).calcularSeguro();
            System.out.println("======================");
        
        
    }

    public int ultimaPosicion(Vehiculo mVehiculo[]) {
        for (int j = 0; j < mVehiculo.length; j++) {
            if (mVehiculo[j] == null) {
                return j;
            }
        }
        return -1;
    }

    public static void añadirCoche(Vehiculo mVehiculo){
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Dime el precio del mercado de tu vehiculo: ");
        double precio = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.print("Dime el año de tu vehiculo: ");
        int año = mScanner.nextInt();
        mScanner.nextLine();
        System.out.print("Dime el numero de puertas de tu coche de tu vehiculo: ");
        int numpuertas = mScanner.nextInt();
        mScanner.nextLine();
        mVehiculo = new Coche(precio, año, numpuertas);
    }

}
