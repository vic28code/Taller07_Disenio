/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tiendaminorista;

/**
 *
 * @author aleja
 */
//Implementación del patrón Iterator
public class TarjetaCredito {
    String tipo;
    double costoAnual;
    double limiteCredito;

    public TarjetaCredito(String tipo, double costoAnual, double limiteCredito) {
        this.tipo = tipo;
        this.costoAnual = costoAnual;
        this.limiteCredito = limiteCredito;
    }
}