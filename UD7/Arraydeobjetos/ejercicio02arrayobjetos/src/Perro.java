public class Perro {
    private String nombre;
    private String color;
    private String raza;

    public Perro (String nombre, String color, String raza){
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
