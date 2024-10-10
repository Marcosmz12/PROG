public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        int x;
        double y = 0.001;
        double multi;
        String linea;

        System.out.print("Dime el numero de Kilobytes: ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);
        
        multi = x / y ;
        System.out.println("Este es el numero de Megabytes que tienes almacenado" + multi);
    }
}