/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MD5;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;


import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;


/**
 *
 * @author Jesus
 */
public class Hash {

    public static String getHash(byte[] inputBytes, String algoritmo) {
        String hashValor = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algoritmo);
            messageDigest.update(inputBytes);
            byte[] digestedBytes = messageDigest.digest();
            hashValor = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
        } catch (Exception e) {
        }
        return hashValor;
    }
    
    public String deecnode(String miClave, String hashValor) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(hashValor.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(miClave.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return desencriptacion;
    }

    public static void main(String[] args) {
        String miClave = "jasg192009";
        Hash hash = new Hash();
        
        System.out.println(getHash(miClave.getBytes(), "MD5"));
        
    }
}
