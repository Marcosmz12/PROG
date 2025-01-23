public class Televisor extends Dispositivo {
    private int pulgadas;
    private String pantalla;
    private String resolucion;

    public Televisor(String marca,int pulgadas, String pantalla, String resolucion) {
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

}
