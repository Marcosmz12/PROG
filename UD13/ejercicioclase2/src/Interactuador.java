import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import pool.ConnectionPool;

public interface Interactuador {
    final String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    Connection conn = pool.getConnection();
    GestorSocios miGestor = new GestorSocios(conn);
    Scanner scanner = new Scanner(System.in);

    public static void consultaFiltrada() {
        ArrayList<Socio> lista = null;
        System.out.print("Escriba la columna por la que filtrar: ");
        String columna = scanner.nextLine();

        try {
            switch (columna) {
                case "nombre":
                    System.out.print("Escriba el nombre del socio: ");
                    String nombre = scanner.nextLine();
                    lista = miGestor.query(columna, nombre);
                    break;
                case "localidad":
                    System.out.println("Escriba la localidad de residencia: ");
                    String localidad = scanner.nextLine();
                    lista = miGestor.query(columna, localidad);
                    break;
                case "":

                break;

                default:
                    break;
            }

            if (lista.isEmpty()) {
                System.out.println("No se encuentran socios con esos criterios.");
            }
            for (Socio socio : lista) {
                System.out.println(socio);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultaOrdenada(){
        ArrayList<Socio> lista = null;
        System.out.print("Escribe el criterio de ordenacion: ");
        String criterio = scanner.nextLine();
        try {
            lista = miGestor.requestAll(criterio);
            if (lista.isEmpty()){
                System.out.println("No se encuentra socios con ese criterio");
            }
            for (Socio socio : lista) {
                System.out.println(socio);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultarPorID(){
        System.out.print("\nEscriba el ID del socio: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        try {
            Socio socio = miGestor.requestById(id);
            if (socio != null) {
                System.out.println(socio);
            } else {
                System.out.println("no se encuentra ningun socio con esa ID");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void altaSocio(){
        System.out.print("\nEscribe el ID del socio: ");
    }

}
