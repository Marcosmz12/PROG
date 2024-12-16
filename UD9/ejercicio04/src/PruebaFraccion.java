import java.util.Scanner;

public class PruebaFraccion {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.println("Esta es tu fraccion");
        Fraccion fraccion = new Fraccion(80, 40);
        System.out.println(fraccion);

        System.out.println("Fraccion invertida");
        System.out.println(fraccion.invierte());

        System.out.print("Dime un numero por el que quieras multiplicar tu fraccion : ");
        int numero = mScanner.nextInt();
        mScanner.nextLine();
        System.out.println(fraccion.multiplica(numero));

        System.out.println(fraccion.divide(numero));

        mScanner.close();
    }
}