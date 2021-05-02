/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_65;

/**
 *
 * @author Jesus
 */
import Encapsulamiento_64.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("jesus", 5000.00, false);
        System.out.println("persona1 : " + persona1);
//        System.out.println("persona1 sin cambio "+ persona1.getNombre());
        persona1.setNombre("jesus gamez");
//        System.out.println("persona 1 nombre con cambio " + persona1.getNombre());
//        System.out.println("persona1 sueldo "+ persona1.getSueldo());
//        System.out.println("persona1 eliminado "+ persona1.isEliminado());
        System.out.println("persona1 : " + persona1.toString());
    }
}
