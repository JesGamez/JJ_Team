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
public class IgualdadyRelacionales_27 {

    public static void main(String[] args) {
        var a =3;
        var b =2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        // cuando usamos cadenas debemos de preguntar de la siguiente manera
        var cadena = "hola";
        var cadena2 = "hola";
        var e = cadena == cadena2; // compara referencias de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2); // compara contenido de las cadenas
        System.out.println("f = " + f);
    }
}
