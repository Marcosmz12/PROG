public class Gestionvehiculos {
    public static void main(String[] args) throws Exception {
        Vehiculo[] mVehiculo = new Vehiculo[3];

        mVehiculo[0] = new Camion(12000, 2020, 1500);
        mVehiculo[1] = new Camion(20000, 2025, 1000);
        mVehiculo[2] = new Coche(30000, 2024, 5);

        for (int i = 0; i < mVehiculo.length; i++) {
            System.out.println(mVehiculo[i]);
        }
    }
}
