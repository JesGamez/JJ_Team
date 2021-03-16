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
public class OperadoresUnarios_26 {

    public static void main(String[] args) {
        int a = 3;
        //invertimos el signo del valor de la variable a
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        //invertimos el valor de true a false con la negación
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //unarios de incremento
        //el preincremento (simbolo antes dela variable)
        var e = 3;
        var f = ++e; // primero me incrementa la variable e y despues se usa su valor en f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //el posincremento (simbolo despues dela variable)
        var g = 5;
        var h = g++;// primero se asgina el valor a h y luego se incrementa en g
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        // unarios de decremento
        // el predecremento
        var i = 2;
        var j = --i; // i pasa a tener el valor de 1 y el valor de 1 se utiliza en j
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // postcremento
        var k= 4 ; 
        var l= k--; // primero se usa el valor de la variable k en la variable l y se le asigna el decremento a k
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
