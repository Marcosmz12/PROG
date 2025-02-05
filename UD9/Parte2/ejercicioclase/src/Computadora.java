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
    public String encender() {
        encendido = "encendido";
        programa = "Visual Studio";
        System.out.println("Su computadora a " + encendido + " y ha iniciado el programa " + programa);
        return encendido;
    }

    @Override
    public String apagar() {
        encendido = "apagado";
        programa = " ";
        System.out.println("Su computadora se ha " + encendido);
        return encendido;
    }

    @Override
    public String toString() {
        return "Computadora: "+ " marca: " + marca + " ram: " + ram + " disco: " + disco + " procesador: " + procesador;
    }
}
