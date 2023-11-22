package Especializar;

public class Coche extends Vehiculos {
    
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    
    public void abrirPuertas() {
        System.out.println("Abriendo las puertas del coche.");
    }
}

