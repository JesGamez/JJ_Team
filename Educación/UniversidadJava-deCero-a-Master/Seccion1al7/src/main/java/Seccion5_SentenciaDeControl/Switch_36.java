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
public class Switch_36 {

    public static void main(String[] args) {
        var numero = 5;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            case 4:
                numeroTexto = "numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
