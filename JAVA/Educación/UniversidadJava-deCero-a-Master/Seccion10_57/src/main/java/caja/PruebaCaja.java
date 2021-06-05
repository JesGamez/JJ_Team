/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author Jesus
 */
public class PruebaCaja {

    public static void main(String[] args) {
       // int ancho = 3, alto = 2, profundo = 6;
        
        Caja caja = new Caja();
        caja.ancho = 3;
        caja.alto = 2;
        caja.profundo = 6;
        caja.calcularVolumen();
        
        Caja caja2 = new Caja(3, 2, 6);
        caja2.calcularVolumen();
    }
}
