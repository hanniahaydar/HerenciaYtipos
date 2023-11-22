package Especializar;
public class Gato extends Animal {
    
    private boolean esDomestico;

    public Gato(String nombre, int edad, boolean esDomestico) {
        super(nombre, edad);
        this.esDomestico = esDomestico;
    }
    public void maullar() {
        System.out.println("¡Miau! ¡Miau!");
    }
    
}