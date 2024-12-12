public class Caballo {
    String nombre;
    String raza;
    String color;

    Caballo(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    String getNombre() {
        return this.nombre;
    }

    String getRaza (){
        return this.raza;
    }

    String getColor() {
        return this.color;
    }

    public String toString(){
        return "Caballo" + "de raza" + "de color";
    }
}
