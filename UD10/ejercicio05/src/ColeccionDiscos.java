import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionDiscos {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        ArrayList<Disco> album = new ArrayList<Disco>();
        int opcion;
        
        album.add(new Disco("1234", "Dellafuente", "Taifa-YAllah", "Urbano", 2));
        album.add(new Disco("2345", "Maka", "MAldiciones", "Urbano", 1));
        album.add(new Disco("3456", "Morad", "M.D.L.R", "Urbano", 1));

        System.out.println("\n\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
        

        do {
            opcion = mScanner.nextInt();
            mScanner.nextLine();
            switch (opcion) {
                case 1:
                    for (Disco disco : album) {
                        System.out.println("Albums: " + disco);
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 5);

        mScanner.close();
    }
}
