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
public class OperadoresAsignación_25 {

    public static void main(String[] args) {
        int a =3,b=2;
        //todo se evalua de izquierda a derecha y el resultado se va a asignar a la variable c
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        //aumentamos 1 a la variable a
        a += 1; // es equivalente a a = a + 1
        System.out.println("a = " + a);
        
        a += 3; // es equivalente a a = a + 3
        System.out.println("a = " + a);
        
        a -=2; // es equivalente a a = a - 2
        System.out.println("a = " + a);
        
        a *=2; // es equivalente a a = a * 2
        System.out.println("a = " + a);
        
        a /=2; // es equivalente a a = a / 2
        System.out.println("a = " + a);
        
        a %=2; // es equivalente a a = a % 2
        System.out.println("a = " + a);
    }
}
