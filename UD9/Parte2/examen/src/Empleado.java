/**
 * @author Marcos Molis Zapata 1ºDAM (T)
 * 
 */

public abstract class Empleado {
    /**
     * @param nombre         Obtiene el nombre del empleado
     * @param edad           Obtiene la edad del empleado
     * @param idEmpleado     Obtiene el id del empleado
     * @param salarioBase    Obtiene el salario base del empleado
     * @param anosDeTrabajo  Obtiene los años de trabajo del empleado
     * @param totalEmpleados Obtiene el total de empreados que hemos creado del
     *                       empleado
     */
    private String nombre;
    private int edad;
    private String idEmpleado;
    private double salarioBase;
    private int anosDeTrabajo;
    private static int totalEmpleados;

    /**
     * Aqui creamos el constructor de la clase empleado
     */
    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.anosDeTrabajo = anosDeTrabajo;
        totalEmpleados++;
    }

    /**
     * @return nombre nos guarda el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nos modifica el nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return edad nos guarda la edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad nos modifica la edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return idEmpleado nos guarda el IdEmpleado del empleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado nos modifica el id de nuestro empleado
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return salarioBase nos guarda el salario base del empleado
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase nos modifica el salario base del empleado
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return anosDeTrabajo nos guarda los años de trabajo del empleado
     */
    public int getAnosDeTrabajo() {
        return anosDeTrabajo;
    }

    /**
     * @param anosDeTrabajo nos modifica los años de trabajo del empleado
     */
    public void setAnosDeTrabajo(int anosDeTrabajo) {
        this.anosDeTrabajo = anosDeTrabajo;
    }

    /**
     * @return totalEmpleados nos guarda todos los empleados que hemos creado
     */
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    /**
     * El metodo toString muestra los parametros que queremos que se vean
     */
    public String toString() {
        return "Empleado: " + nombre + ", Edad: " + edad + ", ID: " + idEmpleado + ", Salario Base: " + salarioBase
                + ", Años de Trabajo: " + anosDeTrabajo;
    }

}
