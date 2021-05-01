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
public class Caja {
    // formula vol = ancho * alto * profundo
    int ancho, alto, profundo;

    public Caja() {
        System.out.println("Constructor Vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        System.out.println("Constructor con argumentos");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void calcularVolumen(){
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("volumen = " + volumen);
    }

}
