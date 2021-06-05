package methodReference;

@lombok.Data
public class Persona {
    private int id;
    private String nombre;

    public Persona(){}

    public Persona(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}
