/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion6_Ciclos;

/**
 *
 * @author Jesus
 */
public class Etiquetas_43 {

    public static void main(String[] args) {
        // las etiquetas indican al break o al continue ir a un lugar específico de nuestro programa
        // se conoce como programacion go to, no es buena practica, pero se debe conocer como funciona

        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio; // ir a la linea de codigo de la etiqueta
            }
            System.out.println("contador = " + contador);
        }
    }
}
