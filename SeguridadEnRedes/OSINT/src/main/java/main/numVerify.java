package main;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class numVerify {
    public static void main(String[] args)throws MalformedURLException {
        System.out.println("--------Escribe tu numero aquí---------");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        try{
            URL url=new URL("http://apilayer.net/api/validate?access_key=f6b5b9a82ac13bfebfdd3cc5d82e217b&number="+numero+"&country_code=PE&format=1");
            
            URLConnection con=url.openConnection();
            BufferedReader bf=new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            while((linea=bf.readLine())!=null){
                if(linea.equals("{") || linea.equals("}")){
                    
                }else{
                    System.out.println("[ + ] "+linea);
                }
            }
        }catch(IOException ioe){
            
        }
        
    }
}
