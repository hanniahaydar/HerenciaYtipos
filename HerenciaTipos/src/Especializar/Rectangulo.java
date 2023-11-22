package Especializar;
public class Rectangulo extends Figuras{
    
    int base;
    int altura;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area(){
        int resultado = base*altura;
        System.out.println("El area del rectangulo es: " + resultado);
    }
    
}