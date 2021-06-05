
package Seccion3_TiposPrimitivos;

/**
 *
 * @author Jesus
 */
public class TiposPrimitivosFlotantes_16 {
    public static void main(String[] args) {
        /*
            tipos primitivos que almacenan flotantes: float, double
         */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("valor maximo del float: " + Float.MAX_VALUE);
        
        //Double es el mas grande en JAVA
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo del double: " + Double.MIN_VALUE);
        System.out.println("valor maximo del double: " + Double.MAX_VALUE);
    }
}
