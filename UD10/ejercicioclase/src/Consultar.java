import java.util.Scanner;

public class Consultar {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        GestorCP miGestorCP = new GestorCP();
        String provincia;
        int cp;

        System.out.println("Consultor de Codigo postales:");
        System.out.println("=============================");
        System.out.println("1. Añadir provincia y cp.");
        System.out.println("2. Borrar Provincia.");
        System.out.println("3. Borrar CP.");
        System.out.println("4. Listado de cp de la provincia.");
        System.out.println("5. Listado de todo. ");

        int opcion = mScanner.nextInt();
        mScanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Digame el nombre de su provincia: ");
                provincia = mScanner.nextLine();
                System.out.println("Digame el codigo postal de su provincia: ");
                cp = mScanner.nextInt();
                mScanner.nextLine();
                miGestorCP.añadir(provincia, cp);
                break;

            case 2:
                System.out.println("Digame el nombre de la provincia que quieres borra: ");
                provincia = mScanner.nextLine();
                miGestorCP.borrarProv(provincia);
                break;

            case 3:
                System.out.println("Nombre de la provincia , donde quiere borrar el cp: ");
                provincia = mScanner.nextLine();
                System.out.println("CP que quiere borrar: ");
                cp = mScanner.nextInt();
                mScanner.nextLine();
                miGestorCP.borrarCP(provincia, cp);

            case 4:
                System.out.println("Digame la provincia: ");
                provincia = mScanner.nextLine();
                miGestorCP.listarCpdeProv(provincia);
                break;
            case 5:
                miGestorCP.listarTodo();
            default:
                break;
        }

        mScanner.close();
    }
}
