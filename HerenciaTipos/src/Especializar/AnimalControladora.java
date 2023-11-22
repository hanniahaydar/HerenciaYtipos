package Especializar;

public class AnimalControladora {

    
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Buddy", 3, "Labrador");
        miPerro.hacerSonido(); // Método heredado de Animal
        miPerro.ladrar(); // Método específico de Perro

        System.out.println("Nombre del perro: " + miPerro.obtenerNombre());

        Gato miGato = new Gato("Whiskers", 2, true);
        miGato.hacerSonido(); // Método heredado de Animal
        miGato.maullar(); // Método específico de Gato

        System.out.println("Edad del gato: " + miGato.obtenerEdad());
    }
 }
    
