
public class Tecnico extends Empleado implements CalculosLaborales {
    /**
     * @param especialidad con esta variable gardamos la especialidad que tiene el
     *                     tecnico
     */
    private String especialidad;

    /**
     * Constructor de la clase
     * 
     * @param nombre        variable de la clase padre que nos guarda el nombre
     * @param edad          variable de la clase padre que nos guarda la edad
     * @param idEmpleado    variable de la clase padre que nos guarda el id
     * @param salarioBase   variable de la clase padre que nos guarda el salario
     * @param anosDeTrabajo variable de la clase padre que nos guarda los años de
     *                      trabajo
     * @param especialidad  con esta variable gardamos la especialidad que tiene el
     *                      tecnico
     */
    public Tecnico(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String especialidad) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.especialidad = especialidad;
    }

    /**
     * implementamos la interfaz y luego con los if damos las bonificaciones que
     * tiene cada tecnico con su especialidad
     */
    @Override
    public double calcularBonificacion() {
        double bonificacion = 0;
        if (especialidad.equals("Redes")) {
            bonificacion = 1000;
            System.out.println("El tecnico de especialidad: " + especialidad + ", tiene una bonificacion de :"
                    + bonificacion + "€");
        } else if (especialidad.equals("Seguridad")) {
            bonificacion = 1200;
            System.out.println("El tecnico de especialidad: " + especialidad + " tiene una bonificacion de :"
                    + bonificacion + "€");
        } else {
            bonificacion = 800;
            System.out.println("El tecnico de especialidad: " + especialidad + " tiene una bonificacion de :"
                    + bonificacion + "€");
        }
        return bonificacion;
    }

    /**
     * implementamos la interfaz y con ella claculamos el salario del empleado
     */
    @Override
    public double calcularSalario() {
        double resultado = getSalarioBase() + calcularBonificacion();
        System.out.println("Su salario es de " + resultado + "€");
        return resultado;
    }

    /**
     * implementamos la interfaz y calculamos las vacaciones
     */
    @Override
    public int calcularVacaciones() {
        int vacaciones = getAnosDeTrabajo() * 20;
        System.out.println("Usted tiene estos dias de vacaciones: " + vacaciones);
        return vacaciones;
    }

    /**
     * El metodo toString muestra los parametros que queremos que se vean
     */
    @Override
    public String toString() {
        return "Técnico: " + getNombre() + ", Edad: " + getEdad() + ", ID: " + getIdEmpleado() + ", Salario base: "
                + getSalarioBase() + ", Años de trabajo: " + getAnosDeTrabajo() + ", Especialidad: " + especialidad;
    }

}
