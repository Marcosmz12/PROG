public class Producto {
    private String nombre ;
    private int cantidadtotal ;
    private String descripcion;

    public Producto (String nombre , String descripcion , int cantidadtotal){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadtotal = cantidadtotal;
    }

    public boolean vende (int cantidad){
        if (cantidad <= cantidadtotal){
            cantidadtotal -= cantidad;
            return true;
        }else {
            System.out.println("No hay stock suficiente ");
            return false;
        }
    }

    public void reponer (int cantidad){
        this.cantidadtotal += cantidad;
    }

    public void setdescripcion (String des){
        this.descripcion = des ;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getCantidad(){
        return cantidadtotal;
    }

    public String toString(){
        return "Nombre: " + nombre;
    }
}
