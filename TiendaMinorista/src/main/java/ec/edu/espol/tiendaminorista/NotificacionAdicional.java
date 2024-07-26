/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tiendaminorista;

/**
 *
 * @author aleja
 */
public class NotificacionAdicional extends NotificacionHandler {
    public void manejarNotificacion(String mensaje) {
        // Lógica para enviar notificación por otros medios (WhatsApp, Signal, etc.)
        if (siguiente != null) {
            siguiente.manejarNotificacion(mensaje);
        }
    }
}
