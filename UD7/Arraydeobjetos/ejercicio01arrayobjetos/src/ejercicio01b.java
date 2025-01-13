import java.util.Scanner;

public class ejercicio01b {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);
        Gato[] gato = new Gato[4];

        System.out.println("Introduce los datos de los gatos: ");
        System.out.println("----------------------------------");
        for (int i = 0; i < 4; i++) {
            gato[i] = new Gato();
            System.out.println("Gato nº " + (i + 1));
            System.out.print("Nombre : ");
            gato[i].setNombre(mScanner.nextLine());
            System.out.print("Color : ");
            gato[i].setColor(mScanner.nextLine());
            System.out.print("Raza : ");
            gato[i].setRaza(mScanner.nextLine());
        }

        System.out.println("Datos de los gatos: ");
        System.out.println("--------------------");
        for (int i = 0; i < gato.length; i++) {
            System.out.println("Gato nº " + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza : " + gato[i].getRaza());
            System.out.println("---------------------------");
        }

        mScanner.close();
    }
}
