/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

import java.util.List;

/**
 *
 * @author hilda
 */
public class Logistica {
    private EstrategiaDistribucion estrategia;

    public void setEstrategia(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void distribuirProductos(List<Producto> productos) {
        estrategia.distribuir(productos);
    }
}