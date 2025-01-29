
public class Gestor extends Empleado implements CalculosLaborales {
    private double presupuesto;

    /**
     * Constructor de la clase
     * 
     * @param nombre        variable de la clase padre que nos guarda el nombre
     * @param edad          variable de la clase padre que nos guarda la edad
     * @param idEmpleado    variable de la clase padre que nos guarda el id
     * @param salarioBase   variable de la clase padre que nos guarda el salario
     * @param anosDeTrabajo variable de la clase padre que nos guarda los años de
     *                      trabajo
     * @param presupuesto   obtenemos el presupuesto que queremos guardar en la
     *                      variable
     */
    public Gestor(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            double presupuesto) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.presupuesto = presupuesto;
    }

    /**
     * implementamos la interfaz y luego calculamos damos las bonificaciones
     */
    @Override
    public double calcularBonificacion() {
        double gestion = presupuesto * 0.05;
        System.out.println("El tecnico tiene una bonificacion de " + gestion + "€");
        return gestion;
    }

    /**
     * implementamos la interfaz y con ella claculamos el salario del empleado
     */
    @Override
    public double calcularSalario() {
        double resultado = getSalarioBase() + calcularBonificacion();
        System.out.println("Su salario es de " + resultado);
        return resultado;
    }

    /**
     * implementamos la interfaz y calculamos las vacaciones
     */
    @Override
    public int calcularVacaciones() {
        int vacaciones = getAnosDeTrabajo() * 30;
        System.out.println("Usted tiene estos dias de vacaciones: " + vacaciones);
        return vacaciones;
    }

    /**
     * El metodo toString muestra los parametros que queremos que se vean
     */
    @Override
    public String toString() {
        return "Gestor: " + getNombre() + ", Edad: " + getEdad() + ", ID: " + getIdEmpleado() + ", Salario base: "
                + getSalarioBase() + ", Años de trabajo: " + getAnosDeTrabajo() + ", Presupuesto: "
                + presupuesto + "€";
    }
}
