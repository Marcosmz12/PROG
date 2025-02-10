import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import concesionario.Coche;
import concesionario.GestorCoches;

public class Concesionario {
    public static void main(String[] args) throws Exception {
        if (args.length != 1)
            System.out.println("Número de argumentos incorrecto");
        else {
            File fichero = new File(args[0]);
            GestorCoches miGestor = new GestorCoches(fichero);
            ArrayList<Coche> listaCoches = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            Coche miCoche = null;
            String matrícula, marca;
            int elección, año;

            do {
                System.out.println("\nSistema de gestión del concesionario.\nSeleccione una opción:");
                System.out.println("(1) Listar todos");
                System.out.println("(2) Buscar por matrícula");
                System.out.println("(3) Añadir");
                System.out.println("(4) Eliminar");
                System.out.println("(5) Modificar");
                System.out.println("(6) Salir");
                System.out.print("Opción: ");
                elección = Concesionario.solicitarElección(s);

                switch (elección) {
                    case 1: // Listar todos
                        listaCoches = miGestor.recuperarTodos();
                        if (!listaCoches.isEmpty())
                            for (Coche coche : listaCoches)
                                System.out.println(coche);
                        else
                            System.out.println("No se encontraron coches en el fichero.");
                        break;

                    case 2: // Buscar por matrícula
                        System.out.print("Introduzca matrícula: ");
                        matrícula = s.nextLine();
                        miCoche = miGestor.recuperarUno(matrícula);
                        if (miCoche != null)
                            System.out.println("Coche encontrado:\n" + miCoche);
                        else
                            System.out.println("Coche no encontrado");
                        break;

                    case 3: // Añadir
                        System.out.print("Introduzca matrícula: ");
                        matrícula = s.nextLine();
                        System.out.print("Introduzca marca: ");
                        marca = s.nextLine();
                        System.out.print("Introduzca año de matriculación: ");
                        año = Concesionario.solicitarAñoMatrícula(s);
                        miCoche = new Coche(matrícula, marca, año);
                        miCoche = miGestor.añadir(miCoche);
                        if (miCoche != null)
                            System.out.println("Coche añadido:\n" + miCoche);
                        else
                            System.out.println("Se ha producido un error: Coche no añadido");
                        break;

                    case 4: // Eliminar
                        System.out.print("Introduzca matrícula: ");
                        matrícula = s.nextLine();
                        miCoche = miGestor.eliminar(matrícula);
                        if (miCoche != null)
                            System.out.println("Coche eliminado:\n" + miCoche);
                        else
                            System.out.println("Coche no encontrado");
                        break;

                    case 5: // Modificar
                        System.out.print("Introduzca matrícula: ");
                        matrícula = s.nextLine();
                        System.out.print("Introduzca marca: ");
                        marca = s.nextLine();
                        System.out.print("Introduzca año de matriculación: ");
                        año = Concesionario.solicitarAñoMatrícula(s);
                        miCoche = new Coche(matrícula, marca, año);
                        miCoche = miGestor.modificar(miCoche);
                        if (miCoche != null)
                            System.out.println("Coche modificado:\n" + miCoche);
                        else
                            System.out.println("Coche no encontrado");
                        break;
                }
            } while (elección != 6);
            s.close();
        }
    }

    private static int solicitarAñoMatrícula(Scanner s) {
        int añoMatrícula = 0;
        boolean valorCorrecto = false;
        do {
            try {
                añoMatrícula = s.nextInt();
                if (añoMatrícula < 1900 || añoMatrícula > LocalDate.now().getYear())
                    throw new IllegalArgumentException(
                            "El año de matriculación ha de estar entre 1900 y el año en curso.");
                valorCorrecto = true;
            } catch (IllegalArgumentException iae) {
                System.out.println("\nError: " + iae.getMessage());
                System.out.print("Introdúzcalo de nuevo: ");
            } catch (Exception e) {
                System.out.println("\nError: Se esperaba un valor entero.");
                System.out.print("Introdúzcalo de nuevo: ");
            } finally {
                s.nextLine(); // Limpiamos buffer de entrada
            }
        } while (!valorCorrecto);
        return añoMatrícula;
    }

    private static int solicitarElección(Scanner s) {
        int elección = 0;
        try {
            elección = s.nextInt();
            if (elección < 1 || elección > 7)
                throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            s.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }
}