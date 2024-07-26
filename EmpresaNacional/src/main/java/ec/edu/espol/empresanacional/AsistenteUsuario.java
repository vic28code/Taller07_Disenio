/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

/**
 *
 * @author hilda
 */
public class AsistenteUsuario extends Manejador {
    @Override
    public void manejarSolicitud(CambioProducto solicitud) {
        if (solicitud.estaEnGarantia()) {
            // Verificar si el producto está en garantía
            if (siguienteManejador != null) {
                siguienteManejador.manejarSolicitud(solicitud);
            }
        }
    }
}