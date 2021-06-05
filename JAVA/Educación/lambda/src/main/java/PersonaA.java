public interface PersonaA {
    public void caminar();

    default public void hablar(){
        System.out.println("saludo :v persona A");
    }
}
