package Especializar;

public class AnimalControladora {

    
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Buddy", 3, "Labrador");
        miPerro.hacerSonido(); 
        miPerro.ladrar(); 

        System.out.println("Nombre del perro: " + miPerro.obtenerNombre());

        Gato miGato = new Gato("Whiskers", 2, true);
        miGato.hacerSonido(); 
        miGato.maullar(); 

        System.out.println("Edad del gato: " + miGato.obtenerEdad());
    }
 }
    
