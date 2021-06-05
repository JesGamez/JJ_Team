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
public class OperadoresCondicionales_29 {

    public static void main(String[] args) {
        // and y or operadores condicionales
        var a = 8;
        var valorMinimo = 0;
        var valorMáximo = 10;
        var resultado = a >= valorMinimo && a <= valorMáximo;
        if (resultado) {
            System.out.println("dentro del rango");
        } else {
            System.out.println("fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("puede asistir");
        } else {
            System.out.println("esta ocupado");
        }
    }
}
