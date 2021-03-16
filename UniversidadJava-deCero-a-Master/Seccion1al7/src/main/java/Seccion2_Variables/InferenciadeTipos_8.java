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
public class InferenciadeTipos_8 {
    public static void main(String[] args) {
        //desde jdk 10 se puede usar var para que java infiera el tipo de dato
        var miVariableEntera = 15;
        System.out.println(miVariableEntera);
        
        //cuando se declara una variable se puede llamar su valor con "soutv"
        var miVariableCadena = "prueba";
        System.out.println("miVariableCadena = " + miVariableCadena);
    }
}
