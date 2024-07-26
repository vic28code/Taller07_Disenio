/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tiendaminorista;

/**
 *
 * @author aleja
 */
public class NotificacionCorreo extends NotificacionHandler {
    public void manejarNotificacion(String mensaje) {
        // Lógica para enviar notificación por correo electrónico
        if (siguiente != null) {
            siguiente.manejarNotificacion(mensaje);
        }
    }
}
