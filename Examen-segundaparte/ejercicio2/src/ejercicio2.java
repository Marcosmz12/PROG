import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("LIBRERÍA DE SUEÑOS");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.print("Introduce código de libro: ");
        int codigo = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Introduce el precio: ");
        double precio = miScanner.nextDouble();
        miScanner.nextLine();
        System.out.print("Introduce unidades vendidas: ");
        int unidad = miScanner.nextInt();
        miScanner.nextLine();
        System.out.print("Introduce descuento (%): ");
        double descuento = miScanner.nextDouble();
        miScanner.nextLine();

        double preciouni = precio * unidad;
        double preciodes = preciouni / 100 * descuento;
        double preciorebaja = preciouni - preciodes;
        double iva = 16;
        double precioiva = preciorebaja / 100 * iva;
        double total = preciouni + precioiva - preciodes;
        System.out.println("Su ticket:");
        System.out.println("┌─────────────────────────┐");
        System.out.println("│LIBRERÍA DE SUEÑOS       │");
        System.out.println("├─────────────────────────┤");
        System.out.printf("│%-4s %-5s %13.2f│\n", "Cód. ", codigo, precio);
        System.out.printf("│%-1s %-1s %17.2f│\n", unidad, " uds.", preciouni);
        System.out.printf("│%-1s %-2.0f %-2s %17.2f│\n", "-", descuento, "%", preciodes);
        System.out.printf("│%-2.0f %-1s %-2s %16.2f│\n", iva, "%", "IVA", precioiva);
        System.out.printf("│%-5s %19.2f│\n", "TOTAL", total);
        System.out.println("└─────────────────────────┘");

        // Lo que he hecho en mi codigo es diseñar una factura utilizando la clase
        // scanner

    }
}
