
public class Administrativo extends Empleado implements CalculosLaborales {
    private String area;

    /**
     * Constructor de la clase
     * 
     * @param nombre        variable de la clase padre que nos guarda el nombre
     * @param edad          variable de la clase padre que nos guarda la edad
     * @param idEmpleado    variable de la clase padre que nos guarda el id
     * @param salarioBase   variable de la clase padre que nos guarda el salario
     * @param anosDeTrabajo variable de la clase padre que nos guarda los años de
     *                      trabajo
     * @param area nos guarda el area donde esta el administrativo
     */
    public Administrativo(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String area) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.area = area;
    }

    /**
     * implementamos la interfaz y luego calculamos damos las bonificaciones
     */
    @Override
    public double calcularBonificacion() {
        double bonificacion = 0;
        if (area.equals("Recursos humanos")) {
            bonificacion = 20;
        } else {
            bonificacion = 10;
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
        int vacaciones = getAnosDeTrabajo() * 15;
        System.out.println("Usted tiene estos dias de vacaciones: " + vacaciones);
        return vacaciones;

    }

    /**
     * El metodo toString muestra los parametros que queremos que se vean
     */
    @Override
    public String toString() {
        return "Administrativo: " + getNombre() + ", Edad: "+ getEdad() + ", ID: "+ getIdEmpleado() + ", Salario base: " +getSalarioBase() + ", Años de trabajo: "+ getAnosDeTrabajo() + ", Area "
                + area;
    }

}
