public class Camion extends Vehiculo {
    private int cargaMax;

    public Camion(double precioMercado, int anio, int cargaMax) {
        super(precioMercado, anio);
        this.cargaMax = cargaMax;
    }

}
