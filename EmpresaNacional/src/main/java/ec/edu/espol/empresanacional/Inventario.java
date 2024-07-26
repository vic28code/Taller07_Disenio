/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hilda
 */
public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
        // Inicializar productos
    }

    public Iterator<Producto> getIterator() {
        return productos.iterator();
    }
}