public class ejercicio02 {
    public static void main(String[] args) throws Exception {
        int x;
        double y = 166.386;
        double multi;
        String linea;

        System.out.print("Dime el numero de euros: ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);
        
        multi = x * y ;
        System.out.printf("Este es el numero de pesetas que tendrias %10.0f \n",multi);
    }
}