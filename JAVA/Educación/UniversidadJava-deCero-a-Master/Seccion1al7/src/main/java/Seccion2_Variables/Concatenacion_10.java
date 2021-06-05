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
public class Concatenacion_10 {
    public static void main(String[] args) {
        
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println(i + j); //suma de numeros
        System.out.println(i + j + usuario); //se hizo la suma y luego concatena se evalua de izquierda a derecha
        
        //esto se conoce como contexto cadena
        // si primero se toma un string primero los demas tambien se toman como string
        System.out.println(usuario + " " + i + j); 
        
        //para evitar el contexto cadena con parentesis y realiza la suma
        System.out.println(usuario + " " + (i + j)); 
        
        
        
    }
}
