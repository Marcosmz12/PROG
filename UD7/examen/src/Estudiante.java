import java.util.Scanner;
/**
 * @author MArcos Molis Zapata
 * 
 * @param nombre sirve para guardar el nombre del alumno
 * @param nota sirve para guardar la nota del alumno
 * @param cantidadNotas sirve para guardar las notas que hemos obtenido
 */
public class Estudiante {
    private String nombre;
    private double[] nota = new double[10];
    private int cantidadNotas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < nota.length; i++) {
            this.nota = agregarNota(nota);
        }
    }

    /**Aqui lo que hacemos es obtener el nombre
     * @return nos devuelve el nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**Aqui modificamos el nombre del alumno 
     * @param nombre guarda el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Aqui obtenemos la nota
     * @return nos devuelve la nota
     */
    public double[] getNota() {
        return nota;
    }

    /** aqui modificamos la nota
     * @param nota guarda la nota modificada
     */
    public void setNota(double[] nota) {
        this.nota = nota;
    }

    
    /**
     * @return devuelve el numero de las cantidades de notas 
     */
    public int getCantidadNotas() {
        return cantidadNotas;
    }
    

    /**agregarNota sirve para agregar notas al array
     * @param nota2 sirve para guardar las notas 
     * @return delvuelve la nota 
     */
    public double[] agregarNota(double[] nota2) {
        Scanner mScanner = new Scanner(System.in);
        double[] agergoNota = new double[10];
        for (int i = 0; i < agergoNota.length; i++) {
            if (nota2[i] > 10) {
                System.out.println("Esa tipo de nota no esta permitida : ");
            } else {
                for (i = 0; i < this.nota.length; i++) {
                    cantidadNotas++;
                    System.out.print("Cuales son tus notas: ");
                    agergoNota[i] = mScanner.nextDouble();
                    agergoNota[i] = this.nota[i];

                }
            }
        }
        mScanner.close();
        return this.nota;
    }

    public int calcularPromedio() {
        int resultado = 0;
        int acumuladora = cantidadNotas;
        for (int i = 0; i < acumuladora; i++) {
            
        }
        return resultado;
    }

    public String toString() {
        return "Estudiante[nombre= " + nombre + " ;notas= " + agregarNota(nota) + "promedio =";
    }
}
