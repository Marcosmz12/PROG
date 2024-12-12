import java.util.Scanner;

import matematica.Esprimo;
import matematica.Siguienteprimo;
import matematica.Voltear;
import matematica.Capicua;

public class ejercicio1al14 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.print("Digame un numero : ");
        int numero = mScanner.nextInt();
        mScanner.nextLine();

        if (Esprimo.esPrimo(numero)) {
            System.out.println("El " + numero + " es primo.");
            System.out.println("El numero siguiente al primo es " + Siguienteprimo.siguienteprimo(numero));
        } else {
            System.out.println("El " + numero + " no es primo.");
        }

        
        System.out.println("Contiene " + matematicas.contadornumeros(numero) + " digitos");
        System.out.println("El numero dado la vuelta es " + Voltear.voltea(numero));

        System.out.println("Introduzca una base: ");
        double base = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.println("Introduzca un exponente: ");
        int exponente = mScanner.nextInt();
        mScanner.nextLine();

        double resultado = matematicas.potencia(base, exponente);
        System.out.println("Su base " + base + " elevada " + exponente + " es " + resultado);

        System.out.print("Dime la posicion que quieres del numero: ");
        int posicion = mScanner.nextInt();
        mScanner.nextLine();
        long numeros = matematicas.digitoN(numero, posicion);
        System.out.println("El numero que esta en esa posicion es " + numeros);

        mScanner.close();
    }
}
