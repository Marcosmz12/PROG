public class Computadora extends Dispositivo {
    private int ram;
    private int disco;
    private int procesador;
    private boolean encendido;
    private String programa;

    public Computadora(int ram, int disco, int procesador, String marca) {
        super(marca);
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        encendido = false;
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
        encendido = true;
        programa = "VisualStudio";
    }

    public void apagar(){
        encendido = false;
        programa = " ";
        System.out.println("Ordenador apagado");
    }

    @Override
    public String toString() {
        return "Computador: [Marca: " + marca + " RAM: " + ram + " Disco: " + disco + " Procesador: " + procesador + "]";
    }

}
