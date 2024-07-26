/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tiendaminorista;

/**
 *
 * @author aleja
 */

// Implementación del Patrón Chain of Responsibility
public abstract class NotificacionHandler {
    protected NotificacionHandler siguiente;

    public void setSiguiente(NotificacionHandler siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarNotificacion(String mensaje);
}
