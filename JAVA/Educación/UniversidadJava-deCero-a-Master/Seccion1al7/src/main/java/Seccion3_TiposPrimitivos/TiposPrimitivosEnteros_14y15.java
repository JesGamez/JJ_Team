/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion3_TiposPrimitivos;

/**
 *
 * @author Jesus
 */
public class TiposPrimitivosEnteros_14y15 {

    public static void main(String[] args) {
        /*
            tipos primitivos que almacenan enteros: byte, short, int, long
         */
        //conversion de tipos
        byte numeroByte = (byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo del byte: " + Byte.MAX_VALUE);

        //tipos numéricos enteros
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("valor maximo del short: " + Short.MAX_VALUE);
        
        //aumentar el literal para poder hacer la conversion con la L al final para tipo long
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo del int: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("valor maximo del long: " + Long.MAX_VALUE);
    }
}
