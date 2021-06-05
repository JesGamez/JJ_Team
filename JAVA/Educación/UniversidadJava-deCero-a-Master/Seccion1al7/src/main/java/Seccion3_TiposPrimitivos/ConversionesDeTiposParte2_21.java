/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion3_TiposPrimitivos;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class ConversionesDeTiposParte2_21 {

    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        var edadtexto = String.valueOf(edad);
        System.out.println("edadtexto = " + edadtexto);
        
        //charAt es para convertir nuestra variable en char comenzando el indice en 0
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        var consola = new Scanner(System.in);
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
