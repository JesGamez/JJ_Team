/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasoPorValoryReferencia;

import Seccion7_Clases.Persona_44y45;

/**
 *
 * @author Jesus
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        
        // guarda referencia a objetos
        Persona_44y45 persona = new Persona_44y45();
        persona.nombre = "Jesus";
        System.out.println("persona nombre = " + persona.nombre);   
        cambiaValor(persona);
        System.out.println("persona nuevo valor = " + persona.nombre);
    }
    
    // estan referenciando al mismo objeto
    public static void cambiaValor(Persona_44y45 persona){
        persona.nombre = "Angie";
    }

}
