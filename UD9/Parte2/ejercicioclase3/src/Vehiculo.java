public class Vehiculo {
    protected double precioMercado;
    protected int anio;
    private static int totalVehiculo = 0;

    public Vehiculo(double precioMercado, int anio) {
        this.precioMercado = precioMercado;
        this.anio = anio;
        totalVehiculo ++;
    }

    public static int obtenerTotalvehiculo() {
        return totalVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo : " + "Precio de mercado: " + precioMercado + " año: " + anio;
    }
}
