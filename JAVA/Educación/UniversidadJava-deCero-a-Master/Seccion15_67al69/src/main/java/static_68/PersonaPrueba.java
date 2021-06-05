/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_68;

import static_67.Persona;

/**
 *
 * @author Jesus
 */
public class PersonaPrueba {

    private int contador;

    public static void main(String[] args) {

        Persona personal = new Persona("Jesus");
        Persona personal2 = new Persona("Angie");

        // no se puede usar this en un metodo estatico
        imprimir(personal);
        imprimir(personal2);

    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    public int getContador() {
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
