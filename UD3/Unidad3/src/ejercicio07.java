public class ejercicio07 {
    public static void main(String[] args) throws Exception {
        double x;
        double y = 1.21;
        double multi;
        String linea;

        System.out.print("Dime tu factura : ");
        linea = System.console().readLine();
        x = Double.parseDouble(linea);
        
        multi = x / y ;
        System.out.printf("Esta es tu factura con la base imponible %10.0f \n",multi);
    }
}