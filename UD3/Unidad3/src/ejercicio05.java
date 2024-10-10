public class ejercicio05 {
    public static void main(String[] args) throws Exception {
        double alt;
        double base;
        double multi;
        String linea;
        System.out.print("Dime la base de tu rectangulo : ");
        linea = System.console().readLine();
        base = Double.parseDouble(linea);
        System.out.print("Dime la altura de tu rectangulo : ");
        linea = System.console().readLine();
        alt = Double.parseDouble(linea);

        multi = alt * base ;
        System.out.printf("El area de tu rectangulo es : %10.5f \n", multi);
    }
}
