package Especializar;

public class Desarrollador extends Empleado {
    
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Método específico para la clase Desarrollador
    public void codificar() {
        System.out.println("El desarrollador está codificando en " + lenguajeProgramacion + ".");
    }
}