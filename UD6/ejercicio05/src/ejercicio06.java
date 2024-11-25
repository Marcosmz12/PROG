import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int numeroaleatorio =0;
        int opurtunidades = 5;
        System.out.println("Intenta acertar el numero aletario entre 0 y 100 ");
            numeroaleatorio = mScanner.nextInt();
        
        int numeroalazar = ((int)(Math.random()*100)+1);
        if (numeroaleatorio == numeroalazar) {
            System.out.println("¡ENHORABUENA! has acertado");
        }else {
            do {
                System.out.println("Te quedan");
            System.out.println("Intenta acertar el numero aletario entre 0 y 100 ");
            numeroaleatorio = mScanner.nextInt();
            } while (condition);
        }
        mScanner.close();
    }
}
