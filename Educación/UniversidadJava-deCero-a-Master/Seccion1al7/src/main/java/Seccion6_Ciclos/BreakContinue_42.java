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
public class BreakContinue_42 {

    public static void main(String[] args) {
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue;//ir a la siguiente iteración
            }
            System.out.println("contador = " + contador);
        }

//        for(var contador = 0; contador < 3;contador++){
//            if(contador % 2 == 0){
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
    }
}
