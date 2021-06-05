import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambda {

    public void ordenar(){
        List<String> lista = new ArrayList<>();
        lista.add("Jesus");
        lista.add("Sanchez");
        lista.add("Gamez");

        /*
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        // lambda
        Collections.sort(lista,(String p1,String p2) -> p1.compareTo(p2));

        for (String elemento : lista){
            System.out.println(elemento);
        }
    }

    public void calcular(){
        /*
        Operacion operacion = new Operacion(){
            @Override
            public double calcularPromedio(double n1,double n2){
                return (n1+n2)/2;
            }
        };

        System.out.println(operacion.calcularPromedio(2,3));


        Operacion operacion = (x, y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(5,3));
         */


    }

    public static void main(String[] args) {
        lambda app = new lambda();
        app.ordenar();
        app.calcular();
    }
}
