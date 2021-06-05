/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion5_SentenciaDeControl;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class SistemaDeCalificaciones_38 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la nota de 0 a 10");
        var nota = Integer.parseInt(consola.nextLine());

        if (nota == 0 || nota < 6) {
            System.out.println("F");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("C");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("B");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        } else {
            System.out.println("Nota desconocida");
        }
    }
}
