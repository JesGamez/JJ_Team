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
public class ConversionesDeTiposParte1_20 {

    public static void main(String[] args) {
        // convertir de string a int
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("tu edad es" + edad);
    }
}
