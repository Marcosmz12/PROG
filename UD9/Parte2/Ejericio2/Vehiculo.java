/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche
 * como subclases de la primera. Para la clase Vehiculo, crea los 
 * atributos de clase vehiculosCreados y kilometrosTotales, así 
 * como el atributo de instancia kilometrosRecorridos. Crea tam-
 * bién algún método específico para cada una de las subclases.
 * Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación
 * 
 * VEHICULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8)
 */

package Ejericio2;

public class Vehiculo {
    protected static int vehiculosCreados;
    protected static int kilometrosTotales;
    protected int kilometrosRecorridos;

        //Constructor
        public Vehiculo(int kilometrosRecorridos){
            this.kilometrosRecorridos = kilometrosRecorridos;
            vehiculosCreados++;
        }

        //Getters y setters
        public int getKilometrosRecorridos() {
            return kilometrosRecorridos;
        }

        public void setKilometrosRecorridos(int km){
            
        }

        public static int getKilometrosTotales() {
            return kilometrosTotales;
        }

        public static void setKilometrosTotales(int kilometrosTotales) {
            Vehiculo.kilometrosTotales = kilometrosTotales;
        }

        public static int getVehiculosCreados() {
            return vehiculosCreados;
        }
        public static void setVehiculosCreados(int vehiculosCreados) {
            Vehiculo.vehiculosCreados = vehiculosCreados;
        }


        //Métodos
        public void anda(int km){

            System.out.println("el vehiculo está andando "+km+" Km.");
            kilometrosRecorridos+=km;
            kilometrosTotales+=km;
        }

}
