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
public class OperadoresAritmeticos_23 {

    public static void main(String[] args) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado = " + resultado);
        
        resultado = a - b;
        System.out.println("resultadoResta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultadoMultiplicacion = " + resultado);
        
        var resultado2 = 3.0 / b;
        System.out.println("resultadoDivision = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        // valor de módulo % es lo que sobra de la division si es exacta o no
        if (b % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
