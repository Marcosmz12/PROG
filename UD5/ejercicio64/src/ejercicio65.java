import java.util.Scanner;

public class ejercicio65 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        int anchorectangulo = 6;
        int alturarectangulo = 3;
        int menurectangulo = 0;

        do {
            for (int invent = 0 ; invent < anchorectangulo; invent++){
                System.out.print("*");
            }
            System.out.println();

            for (int invent = 0; invent < alturarectangulo -2; invent++){
                System.out.print("*");

                for (int menosanch = 0; menosanch < anchorectangulo -2; menosanch ++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int invent = 0 ; invent < anchorectangulo; invent++){
                System.out.print("*");
            }
            System.out.println();

            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            menurectangulo = mScanner.nextInt();
            mScanner.nextLine();

            switch (menurectangulo) {
                case 1:
                    anchorectangulo++;
                    alturarectangulo++;
                    break;
                case 2:
                anchorectangulo--;
                alturarectangulo--;
                    break;
                case 3:
                int cambio = anchorectangulo;
                anchorectangulo = alturarectangulo;
                alturarectangulo = cambio;
                    break;
                default:
                    break;
            }
            System.out.println();
        } while (menurectangulo < 4);

        mScanner.close();
    }
}
