/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion4_Operadores;

/**
 *
 * @author Jesus
 */
public class OperadorTernario_30 {

    public static void main(String[] args) {
        // condicion que se debe evaluar y debe de devolver uno u otro valor
        // expresion que debe de regresar un boolean (3>2)
        // si es verdadero o falso se separa con los puntos
        // si son preguntas sencilas se puede reemplazar el if else por esta linea
        var resultado = (3 > 2) ? "verdadero" :  "falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "par": "impar";
        System.out.println("resultado = " + resultado);
    }
}
