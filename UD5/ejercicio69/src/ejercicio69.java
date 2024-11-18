import java.util.Scanner;

public class ejercicio69 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = mScanner.nextInt();

        int piepiramide = 1;
        int longitud = 1;
        int espacios = altura -1;

        mScanner.nextLine();
        while (piepiramide <= altura) {
            for (int i = 1; i <= espacios ; i++){
                System.out.print(" ");
            }   
            for (int i = 0; i <= longitud /2; i++){
                System.out.print("*");
            }

            System.out.print(piepiramide %2 == 1 ? "****" : "    " );

            for(int i = 0; i <= longitud /2;i++){
                System.out.print("*");
            }
            System.out.println();

            piepiramide++;
            espacios--;
            longitud+=2;
        }
        mScanner.close();
    }
}
