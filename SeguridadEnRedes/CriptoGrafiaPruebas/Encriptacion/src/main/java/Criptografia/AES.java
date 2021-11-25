/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criptografia;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Jesus
 */
public class AES {
    
    static Cipher cipher;

    public static String encriptar(String texto, SecretKey llaveSecreta)
            throws Exception {
        byte[] textoByte = texto.getBytes();
        cipher.init(Cipher.ENCRYPT_MODE, llaveSecreta);
        byte[] encriptadoByte = cipher.doFinal(textoByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String textoEncriptado = encoder.encodeToString(encriptadoByte);
        return textoEncriptado;
    }

    public static String desencriptar(String textoEncriptado, SecretKey llaveSecreta)
            throws Exception {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encriptadoByte = decoder.decode(textoEncriptado);
        cipher.init(Cipher.DECRYPT_MODE, llaveSecreta);
        byte[] desencriptadoByte = cipher.doFinal(encriptadoByte);
        String textoDesencriptado = new String(desencriptadoByte);
        return textoDesencriptado;
    }
    
    public String encripAES(String txt, SecretKey llave) throws Exception {
        return encriptar(txt,llave);
    }

    /* Retorna un hash SHA1 a partir de un texto */
    public String DesEncripAES(String txt, SecretKey llave) throws Exception {
         return desencriptar(txt,llave);
    }
    
/*
    public static void main(String[] args) {

        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();

            cipher = Cipher.getInstance("AES");

            String textoEncriptar = "eL GAMEZ";
            System.out.println("Texto a Encriptar: " + textoEncriptar);

            String textoEncriptado = encriptar(textoEncriptar, secretKey);
            System.out.println("Texto Encriptado: " + textoEncriptado);

            String textoDesencriptado = desencriptar(textoEncriptado, secretKey);
            System.out.println("Texto Desencriptado: " + textoDesencriptado);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
*/
    
}
