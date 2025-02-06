public class Coche {
    private String matricula;
    private String nombre;
    private int año;

    public Coche(String matricula, String nombre, int año) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Coche: " + nombre + ", matricula: " + matricula + ", año: " + año;
    }

}
