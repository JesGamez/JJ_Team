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
public class PruebaAritmetica {

    public static void main(String[] args) {
        // variables locales solo se pueden usar dentro del metodo que se definio
        // alcance de variables
        int a = 10, b = 2;
        miMetodo();
        
        // system.gc() va a programar el recolector de basura para que cuando sea posible lo 
        // ejecute y se elimine todos los objetos que ya no esten referenciados por una variable 
        // se guarda en memoria HEAP (objetos se guardan en el HEAP) "new Aritmtica"
        // las variables locales como aritmetica se guardan en STACK
        Aritmetica aritmetica = new Aritmetica();
//        aritmetica.a=3;
//        aritmetica.b=5;
//        aritmetica.sumar();
//        
//        var resultado = aritmetica.sumarConRetorno();
//        System.out.println("resultado desde retorno = " + resultado);  
//        
//        // 5 y 8 son los parámetros que le estamos enviando a nuestro metodo
//        resultado = aritmetica.sumarConArgumento(5, 8);
//        System.out.println("resultado con argumentos = " + resultado);

        //imprimimos las variables que apuntan a los objetos
        System.out.println("aritmetica a: = " + aritmetica.a);
        System.out.println("aritmetica b: = " + aritmetica.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
        
        //no es recomendable ya queconsume muchos recursos
//        aritmetica = null;
//        System.gc();
    }

    public static void miMetodo() {
        // esta fuera del alcance que fue definida
        // int a = 10;
        System.out.println("otro metodo");
    }
}
