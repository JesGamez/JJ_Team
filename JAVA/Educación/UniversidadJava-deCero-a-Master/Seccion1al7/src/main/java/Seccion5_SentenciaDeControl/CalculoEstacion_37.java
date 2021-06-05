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
public class CalculoEstacion_37 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes (del 1 al 12)");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "otonio";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
