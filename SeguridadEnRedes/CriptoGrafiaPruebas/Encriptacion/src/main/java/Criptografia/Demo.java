/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criptografia;

import static Criptografia.AES.cipher;
import static Criptografia.AES.desencriptar;
import static Criptografia.AES.encriptar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Jesus
 */
public class Demo {

    public static void main(String[] args) throws Exception {

        // ----- BASE 64 -----
        Base eD = new Base();

        String password = "jesus";
        String encriptado = eD.encriptar(password);

        System.out.println("BASE64 Encriptado: " + eD.encripBase(password));
        System.out.println("BASE64 Desencriptado:" + eD.DesEncripBase(encriptado));

        // --- AES ------
        AES aes = new AES();

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        cipher = Cipher.getInstance("AES");

        String textoEncriptado = aes.encripAES(password, secretKey);
        System.out.println("AES Encriptado: " + textoEncriptado);

        String textoDesencriptado = aes.DesEncripAES(textoEncriptado, secretKey);
        System.out.println("AES Desencriptado: " + textoDesencriptado);

        // --- SIMPLE ---
        Simple simple = new Simple();

        String textoaEncriptar = simple.encripSIMPLE(password);
        System.out.println("SIMPLE Encriptado: " + textoaEncriptar);

        String textoaDesEncriptar = simple.DesEncripSIMPLE(textoaEncriptar);
        System.out.println("SIMPLE Desencriptado: " + textoaDesEncriptar);

        // --combinado--
        // AES + BASE64 + SIMPLE 
        String encriptadodeTodo = aes.encripAES(eD.encripBase(simple.encripSIMPLE(password)), secretKey);
        System.out.println("AES + BASE64 + SIMPLE : " + aes.encripAES(eD.encripBase(simple.encripSIMPLE(password)), secretKey));
        
        String paso1 = aes.DesEncripAES(encriptadodeTodo,secretKey);
        String paso2 = eD.DesEncripBase(paso1);
        String paso3 = simple.DesEncripSIMPLE(paso2);
        
        
        System.out.println("AES + BASE64 + SIMPLE Desencriptado: " + paso3);

    }
}
