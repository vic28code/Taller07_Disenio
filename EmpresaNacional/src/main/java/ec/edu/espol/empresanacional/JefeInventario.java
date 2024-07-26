/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

/**
 *
 * @author hilda
 */

public class JefeInventario extends Manejador {
    @Override
    public void manejarSolicitud(CambioProducto solicitud) {
        // Certificar existencia del producto en bodega para reposición
        if (solicitud.getPrecio() > 1000) {
            if (siguienteManejador != null) {
                siguienteManejador.manejarSolicitud(solicitud);
            }
        }
    }
}