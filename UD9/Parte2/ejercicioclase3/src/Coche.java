public class Coche extends Vehiculo implements Asegurable {
    private int numPuertas;

    public Coche(double precioMercado, int anio, int numPuertas) {
        super(precioMercado, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularSeguro() {
        return ;
    }

    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDetalles'");
    }
}
