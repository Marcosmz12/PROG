public class ejercicio03 {
    public static void main(String[] args) throws Exception {
        int x;
        double y = 166.386;
        double multi;
        String linea;

        System.out.print("Dime el numero de pesetas: ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);
        
        multi = x / y ;
        System.out.printf("Este es el numero de euros que tendrias:%10.0f150\n",multi);
    }
    
}
