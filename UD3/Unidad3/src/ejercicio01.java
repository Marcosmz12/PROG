public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        int x;
        int y;
        int multi;
        String linea;
        System.out.print("Dime un numero : ");
        linea = System.console().readLine();
        x = Integer.parseInt(linea);

        System.out.print("Dime otro numero : ");
        linea = System.console().readLine();
        y = Integer.parseInt(linea);

        multi = x * y ;
        System.out.print("La multiplicacion de "+x+ " y "+y+ " el resultado es = "+multi);
    }
}
