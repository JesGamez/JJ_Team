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
public class PrecedenciaOperadores_32 {
    public static void main(String[] args) {
        //prioridad de operadores
        // puesto 1: "-+,--,+,-,~,:"
        // puesto 2: () parentesis y dentro cualquiera
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
    }
}
