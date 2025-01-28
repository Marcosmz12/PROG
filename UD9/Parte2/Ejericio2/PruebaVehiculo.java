/**
 * PruebaVehiculo.java
 * Esta es la clase que contendrá el método main para probar las clases
 * y hacer el ejercicio
 * @author Francisco Cobo
 */
package Ejericio2;

public class PruebaVehiculo extends Exception {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche(0);

        Vehiculo miBici = new Bicicleta(0);
        Vehiculo miHonda = new Coche(0);
        System.out.println("Tenemos " + Vehiculo.getVehiculosCreados() + " vehiculos en nuestro garage");
        int opcion;

        System.out.printf("%nVEHICULO%n");
        System.out.printf("========%n");
        System.out.printf("1. Anda con la bicicleta%n");
        System.out.printf("2. Haz el caballito con la bicicleta%n");
        System.out.printf("3. Anda con el coche%n");
        System.out.printf("4. Quema rueda con el coche%n");
        System.out.printf("5. Ver kilometraje de la bicicleta%n");
        System.out.printf("6. Ver kilometraje del coche%n");
        System.out.printf("7. Ver kilometraje total%n");
        System.out.printf("8. Salir%n");
        System.out.printf("Elige una opción (1-8):%n");

        boolean datoValido = false;

        do {
            try {

                do {

                    System.out.printf(">> ");
                    opcion = Integer.parseInt(System.console().readLine());
                    if (opcion < 1 || opcion > 8) {
                        System.out.println("Por favor introduzca una opción válida1");

                    } else {
                        switch (opcion) {
                            case 1:
                                System.out.println("¿Cuántos kms quieres que ande la bicicleta??");
                                miBici.anda(Integer.parseInt(System.console().readLine()));

                                break;
                            case 2:
                                ((Bicicleta) miBici).hacerCaballito();
                                break;
                            case 3:
                                System.out.println("¿Cuántos kms quieres que ande el coche??");
                                miCoche.anda(Integer.parseInt(System.console().readLine()));

                                break;
                            case 4:
                                ((Coche) miCoche).quemaRueda();
                                break;
                            case 5:
                                System.out.println(
                                        "La bicicleta ha recorrido en total: " + miBici.getKilometrosRecorridos()
                                                + " Kms.");
                                break;
                            case 6:
                                System.out.println(
                                        "El coche ha recorrido en total: " + miCoche.getKilometrosRecorridos()
                                                + " Kms.");
                                break;
                            case 7:
                                System.out.println("Los dos vehiculos han recorrido un total de: "
                                        + Vehiculo.getKilometrosTotales() + " Kms.");
                                break;
                            case 8:
                                System.out.println("Saliendo....");
                                break;

                        }
                    }

                } while (opcion != 8);
                datoValido = true;
            } catch (Exception e) {
                System.out.println("Por favor introduzca un dato válido");
            }

        } while (!datoValido);

    }
}
