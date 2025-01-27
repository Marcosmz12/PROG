public class Computadora extends Dispositivo implements Encendible {
    private int ram;
    private int disco;
    private int procesador;
    private String encendido;
    private String programa;

    public Computadora(int ram, int disco, int procesador, String marca) {
        super(marca);
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        encendido = "apagado";
        programa = " ";
    }

    public int getRam() {
        return ram;
    }

    public int getDisco() {
        return disco;
    }

    public int getProcesador() {
        return procesador;
    }

    @Override
    public String toString() {
        return "Computador: [Marca: " + marca + " RAM: " + ram + " Disco: " + disco + " Procesador: " + procesador + "]"
                + " " + encendido;
    }

    @Override
    public String encender() {
        encendido = "encendido";
        programa = "Visual Studio";
        return encendido + programa;
    }

    @Override
    public String apagar() {
        encendido = "apagado";
        programa = " ";
        return encendido + programa;
    }

}
