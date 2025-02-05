import java.util.Scanner;

public class PruebaServiciosHotel {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * 
     * @param opcion          guardamos la opcion que diga el usuario
     * @param mServiciosHotel con el llamamos a los metodos que hemos creado en la
     *                        clase ServiciosHotel
     */
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        ServiciosHotel mServiciosHotel = new ServiciosHotel();
        int opcion;

        /**
         * En este dowhile tenemos el menu en el que el usuario eligira entre sus
         * distintas opciones
         * 
         * En el switch en cada caso llamamos a los metodos que inician cada consulta y
         * devuleve el valor que les hemos introducido
         * 
         * case 1 Delvuelve el listado de una ciudad que el usuario haya elegido con sus
         * servicios
         * 
         * case 2 Añade un nuevo hotel y servicio y solo el servicio si ya esta dicho
         * Hotel
         * 
         * case 3 Pide el hotel que desea borrar y lo elimina
         * 
         * case 4 Pide el hotel y el servicio que desea eliminar y solo elimina el
         * servicio de dicho hotel
         * 
         * case 5 sale del bucle
         */
        do {
            System.out.println(GREEN_BRIGHT + "Menu registrador de Hoteles" + RESET);
            System.out.println("===========================");
            System.out.println("1. Consultar la tabla.");
            System.out.println("2. Añadir un nuevo servicio o Hotel.");
            System.out.println("3. Borrar Hotel.");
            System.out.println("4. Borrar Servicio.");
            System.out.println("5. Salir");
            System.out.println("===========================");
            System.out.print(YELLOW_BRIGHT + "Cual es su seleccion: " + RESET);
            opcion = mScanner.nextInt();
            mScanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del Hotel: ");
                    String ciudad = mScanner.nextLine();
                    mServiciosHotel.listarPorCiudad(ciudad);
                    break;
                case 2:
                    System.out.print("Nombre del Hotel: ");
                    ciudad = mScanner.nextLine();
                    System.out.print("Servicio del Hotel: ");
                    String servicio = mScanner.nextLine();
                    mServiciosHotel.añdirServicios(ciudad, servicio);
                    break;
                case 3:
                    System.out.print("Nombre del Hotel: ");
                    ciudad = mScanner.nextLine();
                    mServiciosHotel.eliminarCiudad(ciudad);
                    break;
                case 4:
                    System.out.print("Nombre del Hotel: ");
                    ciudad = mScanner.nextLine();
                    System.out.print("Nombre de Servicio: ");
                    servicio = mScanner.nextLine();
                    mServiciosHotel.eliminarServicios(ciudad, servicio);
                    break;
                case 5:
                    System.out.println(YELLOW_BRIGHT + "Saliendo...." + RESET);
                    break;
                default:
                    System.out.println(RED_BRIGHT + "Se ha equivocado no existe esa opcion " + opcion + RESET);
                    break;
            }
        } while (opcion != 5);
        mScanner.close();
    }
}