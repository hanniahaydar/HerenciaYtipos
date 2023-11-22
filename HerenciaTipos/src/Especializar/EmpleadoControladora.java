package Especializar;

public class EmpleadoControladora {

    
    public static void main(String[] args) {
        
        Desarrollador desarrollador = new Desarrollador("Juan", 28, 60000.0, "Java");
        desarrollador.trabajar(); // Método heredado de Empleado
        desarrollador.codificar(); // Método específico de Desarrollador

        System.out.println("Salario del desarrollador: " + desarrollador.obtenerSalario());

        Gerente gerente = new Gerente("Ana", 35, 80000.0, "Desarrollo");
        gerente.trabajar(); // Método heredado de Empleado
        gerente.gestionarProyecto(); // Método específico de Gerente

        System.out.println("Nombre del gerente: " + gerente.obtenerNombre());
    }
        
        
    }
    
