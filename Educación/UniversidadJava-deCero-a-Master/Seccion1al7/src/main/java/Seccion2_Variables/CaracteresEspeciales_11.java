/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion2_Variables;

/**
 *
 * @author Jesus
 */
public class CaracteresEspeciales_11 {

    public static void main(String[] args) {
        var nombre = "Nayeli";
        //diagonal inversa es con ALTgr y la tecla donde está, para ponerlo en una nueva línea
        System.out.println("Nueva Linea: \n" + nombre);

        //tabulador espacio definido
        System.out.println("Tabulador: \t" + nombre);
        
        //retroceso
        System.out.println("Retroceso: \b\b" + nombre);
        
        //comillas simple y doble
        System.out.println("simple: \'" + nombre + "\'");
        System.out.println("doble: \"" + nombre +"\"");
    }
}
