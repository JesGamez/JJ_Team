/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criptografia;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Jesus
 */
public class Base {
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private KeySpec ks;
    private SecretKeyFactory skf;
    private Cipher cipher;
    byte[] arrayBytes;
    private String miLlavedeEncriptacion;
    private String miEsquemaDeEncriptacion;
    SecretKey key;

    public Base() throws Exception {
        miLlavedeEncriptacion = "jasg192009@vallegrande.edu.pe";
        miEsquemaDeEncriptacion = DESEDE_ENCRYPTION_SCHEME;
        arrayBytes = miLlavedeEncriptacion.getBytes(UNICODE_FORMAT);
        ks = new DESedeKeySpec(arrayBytes);
        skf = SecretKeyFactory.getInstance(miEsquemaDeEncriptacion);
        cipher = Cipher.getInstance(miEsquemaDeEncriptacion);
        key = skf.generateSecret(ks);
    }

    public String encriptar(String textoSinEncriptar) {
        String textoEncriptado = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = textoSinEncriptar.getBytes(UNICODE_FORMAT);
            byte[] encritado = cipher.doFinal(plainText);
            textoEncriptado = new String(Base64.encodeBase64(encritado));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return textoEncriptado;
    }

    public String desencriptar(String textoEncriptado) {
        String textoDesencriptado = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] eBytes = textoEncriptado.getBytes();
            byte[] encryptedText = Base64.decodeBase64(eBytes);
            byte[] plainText = cipher.doFinal(encryptedText);
            textoDesencriptado = new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return textoDesencriptado;
    }
    
     public String encripBase(String txt) {
        return encriptar(txt);
    }

    /* Retorna un hash SHA1 a partir de un texto */
    public String DesEncripBase(String txt) {
        return desencriptar(txt);
    }
    
    
/*
    public static void main(String[] args) throws Exception {
        Base eD = new Base();

        String texto = "elGamez";
        String encriptado = eD.encriptar(texto);
        String desencriptado = eD.desencriptar(encriptado);

        System.out.println("Texto a Encriptar: " + texto);
        System.out.println("Texto Encriptado:" + encriptado);
        System.out.println("Texto Desencriptado:" + desencriptado);
    }
*/
    
}
