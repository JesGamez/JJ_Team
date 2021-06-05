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
public class EstacionAño_35 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese el numero del mes (1 a 12)");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
    }
}
