/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.empresanacional;

/**
 *
 * @author hilda
 */
// Implementación del patrón de diseño Chain of Responsibility (último párrafo)
public abstract class Manejador {
    protected Manejador siguienteManejador;

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract void manejarSolicitud(CambioProducto solicitud);
}