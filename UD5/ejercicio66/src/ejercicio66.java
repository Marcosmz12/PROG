import java.util.Scanner;

public class ejercicio66 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca la altura de la figura: ");
        int altura = mScanner.nextInt();
        mScanner.nextLine();

        int espacios = 0;

        if ((altura %2 != 0) && (altura >= 3)) {
            for (int linea = 1;linea<= altura; linea++ ){
                for (int numeroEspacio = 1; numeroEspacio <= espacios; numeroEspacio++ ){
                    System.out.print(" ");
                }
                System.out.println("*    *");
                if ((linea <= altura / 2)) {
                    espacios++;
                }else{
                    espacios--;
                }
            }
            
        }else{
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        }
        mScanner.close();
    }
}
