package Especializar;

	public class Gerente extends Empleado {
	    
	    private String departamento;

	    public Gerente(String nombre, int edad, double salario, String departamento) {
	        super(nombre, edad, salario);
	        this.departamento = departamento;
	    }

	    public void gestionarProyecto() {
	        System.out.println("El gerente está gestionando el proyecto en el departamento " + departamento + ".");
	    }
	    
	}