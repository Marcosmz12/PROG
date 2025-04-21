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
public class Carrito {

    private ArrayList<ElementoDeCarrito> elementos = new ArrayList<>();

    public Carrito() {

    }

    public Carrito(ArrayList<ElementoDeCarrito> elementos) {
        this.elementos = elementos;
    }

    public ArrayList<ElementoDeCarrito> getElementos() {
        return elementos;
    }

    public boolean existeElementoConCodigo(int codigo) {
        return this.posicionElementoConCodigo(codigo) != -1;
    }

    private int posicionElementoConCodigo(int codigo) {
        int i = 0;
        for (ElementoDeCarrito elemento : elementos) {
            if (elemento.getProducto().getCodigo() == codigo) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void meteProductoConCodigo(int codigo) {
        if (this.existeElementoConCodigo(codigo)) {
            elementos.get(posicionElementoConCodigo(codigo)).incrementaCantidad(codigo);
        } else {
            Catalogo catalogo = new Catalogo();
            catalogo.cargaDatos();
            elementos.add(new ElementoDeCarrito(catalogo.productoConCodigo(codigo), 1));
        }
    }

    public void eliminaProductoConCodigo(int codigo) {
        if (existeElementoConCodigo(codigo)) {
            int i = 0;
            int posicion = 0;
            for (ElementoDeCarrito elemento : elementos) {
                if (elemento.getProducto().getCodigo() == codigo) {
                    posicion = 1;
                }
                i++;
            }
            elementos.remove(posicion);
        }
    }

}
