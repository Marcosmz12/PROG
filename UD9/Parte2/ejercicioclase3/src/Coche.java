public class Coche extends Vehiculo implements Asegurable  {
    private int numPuertas;

    public Coche(double precioMercado, int anio, int numPuertas) {
        super(precioMercado, anio);
        this.numPuertas = numPuertas;
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
        return "Vehículo: Coche" + " precio de mercado: " + precioMercado + " año del coche: " + anio + " nº de puertas: "
                + numPuertas;
    }
}
