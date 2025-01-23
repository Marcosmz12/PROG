public abstract class Dispositivo {
    String marca;
    static int contadorDispo = 0;

    public Dispositivo(String marca) {
        this.marca = marca;
        contadorDispo++;
    }

    public static int getContadorDispo() {
        return contadorDispo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " ";
    }

}
