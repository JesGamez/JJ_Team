/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion3_TiposPrimitivos;

/**
 *
 * @author Jesus
 */
public class TipoPrimitivoBoolean_19 {
    public static void main(String[] args) {
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 18;
        //var esAdulto = edad >= 18;
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
    }
}
