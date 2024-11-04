import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner mScanner = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseim = mScanner.nextDouble();
        mScanner.nextLine();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String iva = mScanner.nextLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promocion = mScanner.nextLine();

        double general = baseim * 0.21;
        double reducido = baseim * 0.10;
        double superreducido = baseim * 0.04;
        double precioiva = 0;

        System.out.printf("Base Imponible: %10.2f\n",baseim);
        if (iva.equals("general")) {
            System.out.printf("IVA (21%%): %15.2f\n", general);
            precioiva = baseim + general;
            System.out.printf("Precio IVA: %14.2f\n", precioiva);
        } else if (iva.equals("reducido")) {
            System.out.printf("IVA (10%%): %15.2f\n", reducido);
            precioiva = baseim + reducido;
            System.out.printf("Precio IVA: %14.2f\n", precioiva);
        } else if (iva.equals("superreducido")) {
            System.out.printf("IVA (4%%): %14.2f\n", superreducido);
            precioiva = baseim + superreducido;
            System.out.printf("Precio IVA: %14.2f\n", precioiva);
        }

        double mitad = precioiva *0.50;
        double meno5 = precioiva - 5;
        double porc5 = precioiva * 0.05;
        double total = 0;
        if (promocion.equals("nopro")) {
            System.out.printf("Cód. promo. (nopro) %5.2f\n", precioiva);
            System.out.printf("Total: %19.2f\n", precioiva);
        } else if (promocion.equals("mitad")) {
            System.out.printf("Cód. promo. (mitad) %6.2f\n", mitad);
            total = precioiva - mitad;
            System.out.printf("Total: %19.2f\n", total );
        }else if (promocion.equals("meno5")) {
            System.out.printf("Cód. promo. (meno5) %6.2f\n", meno5);
            System.out.printf("Total: %19.2f\n", meno5 );
        }else if (promocion.equals("5porc")) {
            System.out.printf("Cód. promo. (5porc) %5.2f\n", porc5);
            total = precioiva - porc5;
            System.out.printf("Total: %19.2f\n", total );
        }

        mScanner.close();
    }
}
