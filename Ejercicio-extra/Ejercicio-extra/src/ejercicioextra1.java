import java.util.Scanner;

public class ejercicioextra1 {
    public static void main(String[] args) throws Exception {
        String nombre;
        String producto;
        int cantidad;
        double precio;
        double impuesto = 210.000;
        Double totalsin;
        double total;
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = s.nextLine();
        System.out.printf("Ingrese el nombre del producto: ");
        producto = s.nextLine();
        System.out.printf("Ingrese la cantidad: ");
        cantidad = s.nextInt();
        System.out.printf("Ingrese el precio unitario: ");
        precio = s.nextDouble();
        

        total = precio * impuesto;
        totalsin = precio + precio;

        System.out.println("┌─────────────────────┬──────────────────────┐");
        System.out.printf("│%-21s│%22s│\n","Cliente:",nombre);
        System.out.printf("│%-21s│%22s│\n","Producto:",producto);
        System.out.printf("│%-21s│%22s│\n","Cantidad:",cantidad);
        System.out.printf("│%-21s│%22.2f│\n","Precio:",precio);
        System.out.printf("\033[0;32m│%-21s│%22.2f│\n","Total sin impuestos:",totalsin);
        System.out.println("\033[0m│─────────────────────┼──────────────────────│");
        System.out.printf("\033[0;31m│%-21s│%22.2f│\n","Impuesto (21%):",impuesto);
        System.out.println("\033[0m│─────────────────────┼──────────────────────│");
        System.out.printf("\033[1;33m│%-21s│%22s│\n","Total con Impuestos:",total);
        System.out.println("\033[0m└─────────────────────┴──────────────────────┘");
    }
}
