/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion4_Operadores;

/**
 *
 * @author Jesus
 */
public class OperadoresRelacionales_28 {

    public static void main(String[] args) {
        // operadores relacionales nos indicara si son mayores, diferentes o iguales
        var a = 3;
        var b = 2;

        var g = a >= b; //mayor o igual
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
        
        var edad = 10;
        var adulto= 18;
        if (edad >= adulto) {
            System.out.println("es adulto");
        } else {
            System.out.println("no es adulto");
        }
    }
}
