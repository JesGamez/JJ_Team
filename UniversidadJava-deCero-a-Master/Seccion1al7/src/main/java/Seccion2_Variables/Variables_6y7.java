package Seccion2_Variables;

/*
Las variables son cambiantes:

           TIPOS PRIMITIVOS                                             TIPOS REFERENCIADOS (OBJECT)
TIPOS ENTEROS        TIPOS FLOTANTES                    STRINGS         CLASES          INTERFACES       ARRAYS(arreglos)

 */
public class Variables_6y7 {

    public static void main(String[] args) {
        /* Variables inician con minúscula */
        //definir variable
        //tipo permitido int
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        //String no es un tipo permitido sino es una clase de java
        String miVariableCadena = "saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "adios";
        System.out.println(miVariableCadena);
        
    }
}
