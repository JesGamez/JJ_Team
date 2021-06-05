/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion5_SentenciaDeControl;

/**
 *
 * @author Jesus
 */
public class ejercicio_if_else_34 {

    public static void main(String[] args) {
        var numero = 5;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else if (numero == 4) {
            numeroTexto = "numero cuatro";
        } else {
            numeroTexto = "numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
