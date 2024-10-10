public class ejercicio09 {
    public static void main(String[] args) throws Exception {
        double alt;
        double radio;
        double multi;
        String linea;
        System.out.print("Dime el radio de tu cono: ");
        linea = System.console().readLine();
        radio = Double.parseDouble(linea);
        System.out.print("Dime la altura de tu cono: ");
        linea = System.console().readLine();
        alt = Double.parseDouble(linea);

        multi = 3.14 * radio *2 *alt /3 ;
        System.out.printf("El volumen de tu cono es : %10.2f \n", multi);
    }
}
