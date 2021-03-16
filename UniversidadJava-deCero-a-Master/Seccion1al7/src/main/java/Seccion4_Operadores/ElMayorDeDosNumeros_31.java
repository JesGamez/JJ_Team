/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion4_Operadores;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class ElMayorDeDosNumeros_31 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Compare numeros");
        System.out.println("Ingrese primer numero");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese segundo numero");
        var numero2 = Integer.parseInt(consola.nextLine());
        var numeroMayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("numeroMayor = " + numeroMayor);
        //otra manera de hacerlo con ifelse
//        if (numero1 > numero2) {
//            System.out.println(numero1+" es mayor que "+ numero2);
//        } else {
//            System.out.println(numero1 +" es menor que "+ numero2);
//        }
    }
}
