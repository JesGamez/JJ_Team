/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion7_Clases;

/**
 *
 * @author Jesus
 */
public class ObjetosPersona_46y47 {

    public static void main(String[] args) {
        //los objetos no comparten informacion solo los atributos asignadas en las variables
        // variable persona de tipo "Persona_44y45"
        // objeto, estamos instanciando el constructor de la clase "Persona_44y45"
        // creamos el objeto en memoria y ese objeto se le asigna a la variable "persona" 
        Persona_44y45 persona = new Persona_44y45();
        
        // accedemos a los atributos del objeto que hemos creado en la linea anterior
        persona.nombre="Jesus";
        persona.apellido="Sanchez";
        // accedemos al metodo para poder hacer uso e imprimir los valores que hemos asignado
        persona.desplegarInformacion();
        
        // son instancias y/o objetos distintos y como dice en el principio no comparten informacion
        Persona_44y45 persona2 = new Persona_44y45();
        // referencia de la memoria de neustro objeto de valor hexadecimal
        System.out.println("persona = " + persona);
        System.out.println("persona2 = " + persona2);
        
        //cuando son string y no se le manda valor manda null significa ausencia de valor ya que no hemos
        //modificado las variables para persona2
        persona2.desplegarInformacion();
        
        persona2.nombre="Angie";
        persona2.apellido="Nayeli";
        persona2.desplegarInformacion();
        
    }
}
