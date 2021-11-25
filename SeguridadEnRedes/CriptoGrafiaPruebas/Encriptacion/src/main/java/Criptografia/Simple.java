/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criptografia;

/**
 *
 * @author Jesus
 */
public class Simple {

    public static String encriptar(String texto) throws Exception {
        
        char array[] = texto.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char) 5);
        }

        String encriptado = String.valueOf(array);
        
        return encriptado;
    }
    
    public static String desEncriptar(String textoEncriptado) throws Exception {
        
        char array[] = textoEncriptado.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - (char) 5);
        }

        String desEncriptado = String.valueOf(array);
        
        return desEncriptado;
    }
    
    public String encripSIMPLE(String txt) throws Exception {
        return encriptar(txt);
    }

    /* Retorna un hash SHA1 a partir de un texto */
    public String DesEncripSIMPLE(String txt) throws Exception {
         return desEncriptar(txt);
    }
    
    
/*
    public static void main(String[] args) {
        String mensaje = "hola mundo";

        char array[] = mensaje.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char) 5);
        }

        String encriptado = String.valueOf(array);

        System.out.println(encriptado);

        char arrayD[] = encriptado.toCharArray();

        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = (char) (array[i] - (char) 5);
        }

        String desencriptado = String.valueOf(arrayD);

        System.out.println(desencriptado);

    }
*/
    
}
