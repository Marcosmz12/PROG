public class ejercicio10 {
    public static void main(String[] args) throws Exception {
        int x;
        double y = 1000;
        double multi;
        String linea;

        System.out.print("Dime el numero de Megabytes: ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);
        
        multi = x * y ;
        System.out.printf("Este es el numero de kilobytes que tienes almacenado %10.0f \n",multi + " Kb");
    }
}