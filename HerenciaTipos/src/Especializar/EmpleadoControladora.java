package Especializar;

public class EmpleadoControladora {

    
    public static void main(String[] args) {
        
        Desarrollador desarrollador = new Desarrollador("Juan", 28, 60000.0, "Java");
        desarrollador.trabajar(); // 
        desarrollador.codificar(); // 

        System.out.println("Salario del desarrollador: " + desarrollador.obtenerSalario());

        Gerente gerente = new Gerente("Ana", 35, 80000.0, "Desarrollo");
        gerente.trabajar(); // 
        gerente.gestionarProyecto(); 

        System.out.println("Nombre del gerente: " + gerente.obtenerNombre());
    }
        
        
    }
    
