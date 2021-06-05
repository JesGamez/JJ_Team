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
public class TipoPrimitivoChar_18 {
    public static void main(String[] args) {
        //tiene 16 bits igual que un short pero los short solo almacenan valores de comas flotantes
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);
        
        //va a inferir que es un tipo int
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2 = " + varCharSimbolo2);
        
        // un char ocupa 16 bits, int ocupa 32 bits
        // el entero puede ocupar un char y al momento deimprimir va a definirlo con su valor hexadecimal
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
    }
}
