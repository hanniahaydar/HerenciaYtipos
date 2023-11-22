package Especializar;
public class Vehiculos {   
    
    private String marca;
    private String modelo;

    public Vehiculos (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("El vehículo está en movimiento.");
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }  
        
    }

