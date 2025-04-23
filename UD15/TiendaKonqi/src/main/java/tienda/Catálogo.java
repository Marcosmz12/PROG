package tienda;

import java.util.ArrayList;

public class Catálogo {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void cargaDatos() {
        productos.clear();
        productos.add(new Producto(1, "Konqi Gabriel García Márquez KGG-46F3", 23.99, "Bookworm Konqi.png"));
        productos.add(new Producto(2, "Konqi Kevin Mitnick KKM-80E3", 25.5, "Hacker Konqi.png"));
        productos.add(new Producto(3, "Konqi Paul Cézanne KPC-23A4", 18.553, "Artist Konqi.png"));
        productos.add(new Producto(4, "Konqi Doc Hudson KDH-61C5", 17.556, "Mechanic Konqi.png"));
        productos.add(new Producto(5, "Konqi Mark Knopfler KMK-10B9 ", 28.307, "Musician Konqi.png"));
        productos.add(new Producto(6, "Konqi Pedro Duque KPD-42D6", 15.75, "Office Worker Konqi.png"));
        productos.add(new Producto(7, "Konqi Steve Wozniak KSW-39E4", 19, "PC Builder Konqi.png"));
        productos.add(new Producto(8, "Konqi Santiago Ramón y Cajal KSR-02C5", 35.05, "Scientist Konqi.png"));
        productos.add(new Producto(9, "Konqi John Carmack KJC-76D1", 29.948, "Virtual Reality Konqi.png"));
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Producto productoConCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
