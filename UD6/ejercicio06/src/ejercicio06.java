import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int opurtunidades = 5;
        System.out.println("Intenta acertar el numero aletario entre 0 y 100 ");
        int numeroaleatorio = mScanner.nextInt();

        int numeroalazar = ((int) (Math.random() * 100) + 1);


        while ((opurtunidades < 6) && (opurtunidades != 0)) {
            System.out.println("Te quedan " + opurtunidades + " opurtunidades");
            System.out.println("Intenta acertar el numero aletario entre 0 y 100 ");
            numeroaleatorio = mScanner.nextInt();
            opurtunidades--;
        }

        if (opurtunidades == 0) {
            System.out.println("Lo siento has perdido el numero era " + numeroalazar);
        } else if ((numeroaleatorio) == (numeroalazar)) {
            System.out.println("¡ENHORABUENA! has acertado");
        }

        mScanner.close();
    }
}
