/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion2_Variables;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class UsoScanner_12 {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        //tipo ya definido en las clases en JAVA
        Scanner consola = new Scanner(System.in);
        //con consola nextLine se va a detener el programa hasta que el usuario haga uns insercion de datos en la consola
        //luego de leer el valor ingresado se va a asignar a la variable usuario y se va a imprimir en consola
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Ingrese titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: "+titulo+" "+ usuario);
        
    }
}
