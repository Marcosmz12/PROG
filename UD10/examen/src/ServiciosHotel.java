import java.util.ArrayList;
import java.util.HashMap;

public class ServiciosHotel {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset
    HashMap<String, ArrayList<String>> mHashMap = new HashMap<>();

    /**
     * @author Marcos Molis Zapata 1º DAM (T)
     * Esta funcion hace que podamos añadir un hotel con el nombre de una ciudad y
     * el servicio que tiene dicho hotel y podremos registrarlo
     * 
     * @param ciudad   con este parametro guardamos el nombre de la ciudad que sera
     *                 nuestro index en el haspMap y en el arrylist
     * @param servicio el servicio se guarda en el arrayList.
     */
    public void añdirServicios(String ciudad, String servicio) {
        if (!mHashMap.containsKey(ciudad)) {
            ArrayList<String> mArrayList = new ArrayList<>();
            mArrayList.add(servicio);
            mHashMap.put(ciudad, mArrayList);
            System.out.println("Hotel: " + ciudad + "| Servicios: " + servicio);
        } else {
            ArrayList<String> mArrayList = mHashMap.get(ciudad);
            if (!mArrayList.contains(servicio)) {
                mArrayList.add(servicio);
                System.out.println("Hotel: " + ciudad + "| Servicios: " + servicio);
            }
        }
    }

    /**
     * Con esta Funcion podremos borrar directamente todos los servicios y la ciudad
     * que teniamos guardada en el HaspMap
     * 
     * @param ciudad guardamos el nombre del hotel
     */
    public void eliminarCiudad(String ciudad) {
        if (mHashMap.containsKey(ciudad)) {
            mHashMap.remove(ciudad);
            System.out.println(GREEN_BRIGHT + "El hotel ha sido eliminado" + RESET);
        } else {
            System.out.println(YELLOW_BRIGHT + "Este hotel no esta registrado " + ciudad + RESET);
        }
    }

    /**
     * Con esta funcion solo eliminamos el servicio que esta en dicho hotel
     * 
     * @param ciudad   guardamos el nombre del hotel
     * @param servicio guardamos el nombre del servicio
     */
    public void eliminarServicios(String ciudad, String servicio) {
        if (mHashMap.containsKey(ciudad)) {
            ArrayList<String> mArrayList = mHashMap.get(ciudad);
            mArrayList.remove(servicio);
            System.out.println(GREEN_BRIGHT + "Se ha eliminado el servicio del hotel de " + ciudad + RESET);
        } else {
            System.out.println(
                    YELLOW_BRIGHT + "El servicio de " + servicio + " no esta en el hotel de " + ciudad + RESET);
        }
    }

    /**
     * Con esta funcion vemos el hotel que nos ha indicado el usuario y sus
     * serevicios
     * 
     * @param ciudad guardamos el nombre del hotel
     */
    public void listarPorCiudad(String ciudad) {
        if (mHashMap.containsKey(ciudad)) {
            ArrayList<String> mArrayList = mHashMap.get(ciudad);
            System.out.println(GREEN_BRIGHT + "Hotel de " + ciudad + " servicios: " + RESET);
            for (String servicio : mArrayList) {
                System.out.println(servicio + ", ");
            }
            System.out.println();
        } else {
            System.out.println(RED_BRIGHT + "Este hotel no esta registrado" + RESET);
        }
    }
}
