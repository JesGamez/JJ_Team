/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Jesus
 */
public class Aritmetica {

    // valor por defecto del entero es 0
    // atributos
    int a;
    int b;

    //constructor vacio
    // los constructores a diferencia de los metodos no lleva un tipo de retorno 
    // y un constructor no regresa ningun tipo de dato
    // un constructor es un metodo especial
    public Aritmetica() {
        System.out.println("Ejecutando Constructor");
    }
    
    // constructor con argumentos
    // se llama sobrecarga de constructores
    public Aritmetica(int arg1, int arg2) {
       this.a = arg1;
       this.b = arg2;
        System.out.println("ejecutando constructor con argumentos");
    }

    //metodos
    // modificador de acceso "public" y void es porque no va a regresar ninguna informacion
    //metodos inician con minuscula igual que las variables
    // lo que se pone dentro de las () del metodo sumar(), se llaman argumentos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    //metodo con retorno
    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }

    //metodo con argumento
    public int sumarConArgumento(int arg1, int arg2) {
        this.a = arg1; // el arg1 se le asigna al this.a
        this.b = arg2; // el arg2 se le asigna al this.b
//        return a + b;
// si el proyecto tiene un codigo mas complejo este es una buena practica ya que estamos reutilizando codigo
// que seria el return a + b
        return this.sumarConRetorno();
    }
}
