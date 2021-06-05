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
public class DoWhile_40 {

    public static void main(String[] args) {
        // la diferencia es el orden de las lineas que se van a repetir
        // primero lineas de codigo que se van a repetir y luego la condicion, si la condicion 
        // es falsa termina la ejecucion

        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
    }
}
