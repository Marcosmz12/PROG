public class Computadora extends Dispositivo implements Encendible {
    private int ram;
    private int disco;
    private int procesador;
<<<<<<< HEAD
    private String encendido;
=======
    private String encendido = "apagado";
>>>>>>> b49a1450094d7f70a897271dbd73d4658d372346
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

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Computador: [Marca: " + marca + " RAM: " + ram + " Disco: " + disco + " Procesador: " + procesador + "]"
                + " " + encendido;
=======
    public void Encendible() {
        encendido = "Encendido";
        programa = "VisualStudio";
    }

    public void apagar(){
        encendido = "apagado";
        programa = " ";
        System.out.println("Ordenador apagado");
>>>>>>> b49a1450094d7f70a897271dbd73d4658d372346
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
