package Especializar;

public class Circulo extends Figuras{
    
    float radio;
    float pi = 3.1416f;
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    @Override
    public void area(){
        float resultado = pi*(radio*radio);
        System.out.println("El area del circulo es: " + resultado);
    }
    
}