public class GestionEmpleados {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * @author Marcos Molis Zapata 1ºDAM (T)
     * Creamos el array de objetos y lugo llamamos el array y llamamos a las clases
     * hijas con sus constructores y los rellenamos
     * 
     * luego con el for nos muestra el array y los casting que hemos hecho 
     * 
     * y por ultimo sale el contador de empleados que hay en el sistema
     */
    public static void main(String[] args) throws Exception {
        Empleado[] mEmpleados = new Empleado[3];
        mEmpleados[0] = new Tecnico("Juan Pérez", 38, "T003", 2100, 5, "Redes");
        mEmpleados[1] = new Gestor("Ana González", 43, "G017", 3000, 8, 65000);
        mEmpleados[2] = new Administrativo("Carlos Cieza", 34, "A009", 1500, 2, "Recursos humanos");

        for (int i = 0; i < mEmpleados.length; i++) {
            System.out.println(GREEN_BRIGHT + mEmpleados[i] + RESET);
            ((CalculosLaborales) mEmpleados[i]).calcularSalario();
            ((CalculosLaborales) mEmpleados[i]).calcularVacaciones();
            System.out.println(RED_BRIGHT + "================================" + RESET);
        }
        System.out.println(YELLOW_BRIGHT + "Nº de empleados creados: " + Empleado.getTotalEmpleados() + RESET);

    }
}
