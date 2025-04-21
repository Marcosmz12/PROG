/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author nocturno
 */
public class Catalogo {

    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public void cargaDatos() {
        productos.clear();
        productos.add(new Producto(1, "Pelikan Souveran M-1000", 545, ""));
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
