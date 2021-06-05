/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion6_Ciclos;

/**
 *
 * @author Jesus
 */
public class While_39 {

    public static void main(String[] args) {
        // Se ejecuta siempre y cuando la condicion sea verdadera, una vez sea falso va a terminar el ciclo
        var contador = 0;
        
        //contador inicia en 0 y como es menor de 3 la primera impresion su salida es 0
        while (contador < 3) { //contador cumple hasta que se igual a 3
            System.out.println("contador = " + contador);
            contador++; // suma contador en 1           
        }
        
    }
}
