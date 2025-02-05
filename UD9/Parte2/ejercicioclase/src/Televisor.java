public class Televisor extends Dispositivo implements Encendible {
    private int pulgadas;
    private String pantalla;
    private String resolucion;

    public Televisor(String marca, int pulgadas, String pantalla, String resolucion) {
        super(marca);
        this.pulgadas = pulgadas;
        this.pantalla = pantalla;
        this.resolucion = resolucion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getPantalla() {
        return pantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String encender() {
        String encendido = "encendido";
        String programa = "Neox";
        System.out.println("Su Televisor a " + encendido + "y ha iniciado el programa " + programa);
        return encendido + programa;
    }

    @Override
    public String apagar() {
        String apagado = "encendido";
        System.out.println("Su Televisor a " + apagado);
        return apagado;
    }

    @Override
    public String toString() {
        return "Televisor: " + " marca: " + marca + " pulgadas: " + pulgadas + " pantalla: " + pantalla
                + " resolucion: " + resolucion;
    }
}