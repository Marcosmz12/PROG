import java.util.Scanner;
public class ejercicioextra2 {
    public static void main(String[] args) throws Exception {
        Scanner miscanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = miscanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = miscanner.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        long tele = miscanner.nextLong();
                    miscanner.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        String producto = miscanner.nextLine();
        System.out.print("Ingrese el precio unitario del producto: ");
        double preciouni = miscanner.nextDouble(); 
        System.out.print("Ingrese la cantidad comprada del producto: ");
        int cantidad = miscanner.nextInt();
                    miscanner.nextLine();

        System.out.print("Ingrese el nombre del segundo producto: ");
        String producto2 = miscanner.nextLine();
        System.out.print("Ingrese el precio unitario del segundo producto: ");
        double preciouni2 = miscanner.nextDouble();
        System.out.print("Ingrese la cantidad comprada del segundo producto: ");
        int cantidad2 = miscanner.nextInt();
                        miscanner.nextLine();

        System.out.print("Ingrese el nombre del tercer producto: ");
        String producto3 = miscanner.nextLine();
        System.out.print("Ingrese el precio unitario del tercer producto: ");
        double preciouni3 = miscanner.nextDouble();
        System.out.print("Ingrese la cantidad comprada del tercer producto: ");
        int cantidad3 = miscanner.nextInt();
                        miscanner.nextLine();

        double total= preciouni * cantidad;
        double total1 = preciouni2 * cantidad2;
        double total2 = preciouni3 * cantidad3;
        double subtotal = total + total1 + total2;
        double impuesto = subtotal*0.18;
        double descuento = subtotal * 0.10;
        double totalapagar = subtotal + impuesto - descuento;

        System.out.println("------------------------------");
        System.out.println("             FACTURA");
        System.out.println("------------------------------");
        System.out.println("Cliente: "+ nombre);
        System.out.println("Dirección: "+ direccion);
        System.out.println("Teléfono: "+ tele);
        System.out.println("Producto        Precio Unitario  Cantidad  Total Parcial");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %15.2f %10s %15.2f \n", producto, preciouni, cantidad, total);
        System.out.printf("%-10s %15.2f %10s %15.2f \n", producto2, preciouni2, cantidad2, total1);
        System.out.printf("%-10s %15.2f %10s %15.2f \n", producto3, preciouni3, cantidad3, total2);
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %43.2f \n","Subtotal:",subtotal);
        System.out.printf("\033[0;31m%-16s %36.2f \n","Impuestos (18%):",impuesto);
        System.out.printf("\033[0;32m%-16s %36.2f \n","Descuento (10%):",descuento);
        System.out.println("\033[0m--------------------------------------------------------");
        System.out.printf("%-13s %39.2f \n","Total a pagar:",totalapagar);

    }
}