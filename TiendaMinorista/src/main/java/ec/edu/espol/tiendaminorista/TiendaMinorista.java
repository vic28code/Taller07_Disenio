/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tiendaminorista;

/**
 *
 * @author aleja
 */
public class TiendaMinorista {

    public static void main(String[] args) {
        // Ejemplo de uso del Patrón Iterator
        SistemaDeTarjetas sistemaDeTarjetas = new SistemaDeTarjetas();
        sistemaDeTarjetas.agregarTarjeta(new TarjetaCredito("Básica", 50, 1000));
        sistemaDeTarjetas.agregarTarjeta(new TarjetaCredito("Premium", 100, 5000));
        sistemaDeTarjetas.agregarTarjeta(new TarjetaCredito("VIP", 200, 10000));

        Iterator<TarjetaCredito> iterator = sistemaDeTarjetas.getIterator();
        while (iterator.hasNext()) {
            TarjetaCredito tarjeta = iterator.next();
            System.out.println("Tipo: " + tarjeta.tipo + ", Costo Anual: " + tarjeta.costoAnual + ", Límite de Crédito: " + tarjeta.limiteCredito);
        }

        // Ejemplo de uso del Patrón Strategy
        PlataformaAtencionCliente plataforma = new PlataformaAtencionCliente();
        plataforma.setCanalAtencion(new CanalWeb());
        plataforma.atender();

        plataforma.setCanalAtencion(new CanalMovil());
        plataforma.atender();

        plataforma.setCanalAtencion(new CanalTelefonico());
        plataforma.atender();

        // Ejemplo de uso del Patrón Chain of Responsibility
        NotificacionHandler smsHandler = new NotificacionSMS();
        NotificacionHandler correoHandler = new NotificacionCorreo();
        NotificacionHandler adicionalHandler = new NotificacionAdicional();

        smsHandler.setSiguiente(correoHandler);
        correoHandler.setSiguiente(adicionalHandler);

        smsHandler.manejarNotificacion("Recordatorio de pago de tarjeta de crédito.");
    }
}
