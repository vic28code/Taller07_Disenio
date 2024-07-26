/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.empresanacional;

import java.util.List;

/**
 *
 * @author hilda
 */

// Implementación del patrón de diseño Strategy (segundo párrafo)

public interface EstrategiaDistribucion {
    void distribuir(List<Producto> productos);
}
