import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Por favor , vaya introduciendo sus notas y pulse INTRO");
        System.out.println("Para terminar introduzca un numero negativo");
        
        int numero = 0 ;
        int contador = 0; 
        int suma = 0;

        while (numero >= 0) {
            numero = mScanner.nextInt();
            mScanner.nextLine();
            contador ++ ;
            suma = suma + numero;
        }
        System.out.println("Has introducido este numero de notas " + (contador - 1));
        System.out.println("Tu media es "+ (suma / (contador -1 )));
        mScanner.close();
    }
}