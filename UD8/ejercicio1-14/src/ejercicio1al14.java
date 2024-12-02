import java.util.Scanner;

public class ejercicio1al14 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.print("Digame un numero : ");
        int numero = mScanner.nextInt();
        mScanner.nextLine();

        if (matematicas.esPrimo(numero)) {
            System.out.println("El " + numero + " es primo.");
            System.out.println("El numero siguiente al primo es "+ matematicas.siguientePrimo(numero));
        } else {
            System.out.println("El " + numero + " no es primo.");
        }
        

        System.out.println("Contiene " + matematicas.contadornumeros(numero) + " digitos");
        System.out.println(matematicas.voltea(numero));

        System.out.println("Introduzca una base: ");
        double base = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.println("Introduzca un exponente: ");
        int exponente = mScanner.nextInt();
        mScanner.nextLine();
        
        double resultado = matematicas.potencia(base, exponente);
        System.out.print("Su base " + base + " elevada " + exponente + " es " + resultado);

        mScanner.close();
    }
}
