package Especializar;
public class Gato extends Animal {
    
    private boolean esDomestico;

    public Gato(String nombre, int edad, boolean esDomestico) {
        super(nombre, edad);
        this.esDomestico = esDomestico;
    }

    // Método específico para la clase Gato
    public void maullar() {
        System.out.println("¡Miau! ¡Miau!");
    }
    
}