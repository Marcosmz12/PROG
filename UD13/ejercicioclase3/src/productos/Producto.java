/**
 * @author MArcos Molis Zapata
 */

package productos;

/**
 * @param codigo      guardamos el codigo del producto
 * @param descripcion guardamos la descripcion del producto
 * @param codigo      guardamos el precio de compra del producto
 * @param precioVenta guardamos el precio de venta del producto
 * @param stock       guardamos el stock del producto
 * 
 */
public class Producto {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset
    public long codigo;
    public String descripcion;
    public double precioCompra;
    public double precioVenta;
    public int stock;

    public Producto() {
        this(0, "", 0, 0, 0);
    }

    public Producto(long codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Producto(Producto miProducto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        miProducto = new Producto(codigo, descripcion, precioCompra, precioVenta, stock);
    }

    /**
     * Guardamos el codigo introducido
     * 
     * @return nos devuelve el codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * Modificamos el codigo por uno nuevo introducido
     * 
     * @param codigo guarda el nuevo codigo introducido
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * Guardamos la descripcion introducida
     * 
     * @return mos devuelve la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modificamos la descripcion por una nuea introducida
     * 
     * @param descripcion guarda la ueva descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Guardamos el precio de venta introducido
     * 
     * @return mos devuelve la descripcion
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Modificamos el precio de compra por una nuevo introducido
     * 
     * @param precioCompra
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * Guardamos el precio de venta
     * 
     * @return nos da el precio de venta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Mpodificamos el precio de venta por uno nuevo
     * 
     * @param precioVenta nos guarda el nuevo precio introducido
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Guardamos el stock de los productos
     * 
     * @return nos devuelve el stock de los productos
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica el stock de los productos por uno nuevo introducido
     * 
     * @param stock nos guarda el nuevo valor
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    // variables de instancia, constructor(es), getters, setters...
    // Añade un método toString() que permita visualizar las listas de productos
    // con campos coloreados y alineados en columnas

    @Override
    public String toString() {
        return String.format("Producto" + codigo + ", descripcion: " + descripcion + ", precio de compra: "
                + precioCompra + ", precio de venta " + precioVenta + ", stock: " + stock);
    }
}