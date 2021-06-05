/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_67;

/**
 *
 * @author Jesus
 */
public class Persona {

    private int idpersona;
    private String nombre;
    //private int contadorPersonas;
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Persona.contadorPersonas++;
        // asignar el nuevo valor a la variable idPersona
        this.idpersona = Persona.contadorPersonas;
        //this.idpersona = Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", nombre=" + nombre + '}';
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
