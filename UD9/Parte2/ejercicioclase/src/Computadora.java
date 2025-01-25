public class Computadora extends Dispositivo {
    private int ram;
    private int disco;
    private int procesador;
    private String encendido = "apagado";
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

    public void Encendible() {
        encendido = "Encendido";
        programa = "VisualStudio";
    }

    public void apagar(){
        encendido = "apagado";
        programa = " ";
        System.out.println("Ordenador apagado");
    }

    @Override
    public String toString() {
        return "Computador: [Marca: " + marca + " RAM: " + ram + " Disco: " + disco + " Procesador: " + procesador + "]";
    }

}
