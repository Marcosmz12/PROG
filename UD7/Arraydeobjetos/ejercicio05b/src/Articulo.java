public class Articulo {
    private String codigo = "LIBRE";
    private String descripcion;
    private double preciodeCompra;
    private double preciodeVenta;
    private int stock;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciodeCompra() {
        return preciodeCompra;
    }

    public void setPreciodeCompra(double preciodeCompra) {
        this.preciodeCompra = preciodeCompra;
    }

    public double getPreciodeVenta() {
        return preciodeVenta;
    }

    public void setPreciodeVenta(double preciodeVenta) {
        this.preciodeVenta = preciodeVenta;
    }

    public String toString() {
        String cadena = "------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nDescripción: " + this.descripcion;
        cadena += "\nPrecio de compra: " + this.preciodeCompra;
        cadena += "\nPrecio de venta: " + this.preciodeVenta;
        cadena += "\nStock: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";
        return cadena;
    }
}