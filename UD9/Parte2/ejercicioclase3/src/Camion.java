public class Camion extends Vehiculo implements Asegurable {
    private int cargaMax;

    public Camion(double precioMercado, int anio, int cargaMax) {
        super(precioMercado, anio);
        this.cargaMax = cargaMax;
    }

    @Override
    public double calcularSeguro() {
        double seguro = 0;

        if (anio == 2025) {
            double tasabase = 0.2;
            seguro = precioMercado * tasabase / 100;
        } else {
            double tasabase = 0.5;
            seguro = precioMercado * tasabase / 100;
        }
        System.out.println("El seguro de tu coche del año " + anio + " ses de " + seguro);
        return seguro;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del seguro.");
        System.out.println("Año del coche: " + anio);
        System.out.println("Precio de Mercado: " + precioMercado);
    }

    @Override
    public String toString() {
        return "Vehículo: Camión" + " precio de mercado: " + precioMercado + " año del coche: " + anio
                + " Carga maxima: " + cargaMax;
    }

}
