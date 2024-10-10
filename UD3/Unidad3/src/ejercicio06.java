public class ejercicio06 {
    public static void main(String[] args) throws Exception {
        double alt;
        double base;
        double multi;
        String linea;
        System.out.print("Dime la base de tu triangulo : ");
        linea = System.console().readLine();
        base = Double.parseDouble(linea);
        System.out.print("Dime la altura de tu triangulo : ");
        linea = System.console().readLine();
        alt = Double.parseDouble(linea);

        multi = alt * base /2 ;
        System.out.printf("El area de tu triangulo es : %10.5f \n", multi);
    }
}
