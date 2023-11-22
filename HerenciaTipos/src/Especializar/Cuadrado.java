package Especializar;
public class Cuadrado extends Figuras {
    
    int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public void area(){
        int resultado = lado*lado;
        System.out.println("El area del cuadrado es: " + resultado);
    }
    
}
