/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tiendaminorista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author aleja
 */
public class SistemaDeTarjetas {
    private List<TarjetaCredito> tarjetas = new ArrayList<>();

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }

    public Iterator<TarjetaCredito> getIterator() {
        return tarjetas.iterator();
    }
}