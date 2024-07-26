/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

/**
 *
 * @author hilda
 */

public class Tecnico extends Manejador {
    @Override
    public void manejarSolicitud(CambioProducto solicitud) {
        // Constatar tipo de falla y cobertura por garantía
        if (siguienteManejador != null) {
            siguienteManejador.manejarSolicitud(solicitud);
        }
    }
}