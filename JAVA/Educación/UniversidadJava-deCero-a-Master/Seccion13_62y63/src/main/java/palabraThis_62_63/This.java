/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabraThis_62_63;

/**
 *
 * @author Jesus
 */
public class This {

    public static void main(String[] args) {
        Persona persona = new Persona("jesus", "gamez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre " + persona.nombre);
        System.out.println("persona apellido " + persona.apellido);
    }
}

class Persona {

    String nombre, apellido;

    Persona(String nombre, String apellido) {
        // super(); : llamada implicita de la clase Padre(object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona llamando this = " + this);
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }

}

class Imprimir {

    public Imprimir(){
        super(); //el constructor de la clase object(padre) para reservar memoria
    }
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual (this)" + this);
        
    }
}
