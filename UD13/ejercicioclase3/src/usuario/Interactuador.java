package usuario;

import java.util.ArrayList;
import java.util.Scanner;

import pool.ConnectionPool;
import productos.Producto;
import productos.GestorInventario;

public interface Interactuador {    
    // Configuración de la conexión a la base de datos
    final String URL = "jdbc:mariadb://localhost:3306/gestisimal";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    GestorInventario miGestor = new GestorInventario(pool.getConnection());    
    Scanner sc = new Scanner(System.in);

    // Consulta ordenada de productos 
    public static void consultaOrdenada() {
        ArrayList<Producto> productos = null;
        System.out.print("Escriba la columna por donde quiere filtrar: ");
        String columna = sc.nextLine();
        try{ 
            switch (columna) {
                case "codigo":
                    System.out.print("Escriba el codigo del producto: ");
                    long codigo = sc.nextLong();
                    sc.nextLine();
                    miGestor.requestById(codigo);
                    break;
                case "descripcion":
                System.out.print("Escriba la descripcion del producto: ");
                String descripcion = sc.nextLine();
                miGestor.requestAll(descripcion);
                break;
                case "precioCompra":
                
            
                default:
                    break;
            }

            if (columna.isEmpty()) {
                System.out.println("No se encuentran socios con esos criterios.");
            }
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Consulta de datos por ID
    public static void consultaPorCódigo() {  
        System.out.print("\nEScribe el codigo del producto: ");
        long codigo = sc.nextLong();

        try{  
            Producto producto = miGestor.requestById(codigo);
            if (producto != null) {
                System.out.println(producto);
            } else {
                System.out.println("No se encuentra productos con ese codigo.");
            }            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Alta de nuevo producto
    public static void altaProducto() {    
        System.out.println("\nEscriba el codigo del producto: ");
        long codigo = sc.nextLong();
        sc.nextLine();

        try{  
            Producto producto = miGestor.requestById(codigo);
            if (producto != null) {
                miGestor.create(producto);
                System.out.println(producto);
            } else{
                System.out.println("no se encuentra producto con ese codigo");
            } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualización de los datos de un producto
    public static void modificaciónProducto() {       
        System.out.println("\nEscriba el codigo del producto: ");
        long codigo = sc.nextLong();
        sc.nextLine();

        try{ 
            Producto producto = miGestor.requestById(codigo);
            if (producto != null) {
                miGestor.update(producto);
                System.out.println("Producto modificado :" + producto);
            } else{
                System.out.println("no se encuentra producto con ese codigo");
            }         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Baja de un producto
    public static void bajaProducto() {     
        System.out.println("\nEscriba el codigo del producto: ");
        long codigo = sc.nextLong();
        sc.nextLine();

        try{
            Producto producto = miGestor.requestById(codigo);
            if (producto != null) {
                miGestor.delete(codigo);
                System.out.println("Codigo eliminado");
            } else{
                System.out.println("no se encuentra producto con ese codigo");
            }           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Solicitar opción al usuario
    public static int solicitarElección(int OPCIÓN_MAX) {
        int elección = 0;
        try {
            elección = sc.nextInt();
        if (elección < 1 || elección > OPCIÓN_MAX) throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            sc.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }

     // Solicitar valor numérico al usuario     
     // Ejemplo de uso 1: int existencias = (Integer) solicitarValorNumérico(Integer.class);
     // Ejemplo de uso 2: long código = (Long) solicitarValorNumérico(Long.class);
     // Ejemplo de uso 3: double precioCompra = (Double) solicitarValorNumérico(Double.class);
    private static Object solicitarValorNumérico(Class<?> tipo) {
        Object resultado = null;
        while (resultado == null) {
            try { 
                if (tipo == Short.class) resultado = sc.nextShort();
                else if (tipo == Integer.class) resultado = sc.nextInt();
                else if (tipo == Long.class) resultado = sc.nextLong();
                else if (tipo == Float.class) resultado = sc.nextFloat();
                else if (tipo == Double.class) resultado = sc.nextDouble();
                else System.out.println("Tipo de dato no soportado.");
            } catch (Exception e) {
                System.out.print("Valor inválido.\nPruebe de nuevo: ");
            } finally {
                sc.nextLine(); // Limpiamos buffer de entrada
            }
        }        
        return resultado;
    }

    // Cerrar scanner
    public static void cerrarScanner() {
        sc.close();
    }

}

