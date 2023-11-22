package Especializar;

public class Triangulo extends Figuras {
    
    int base;
    int altura;
    
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area(){
        float resultado = (float)((base*altura)/2);
        System.out.println("El area del triangulo es: " + resultado);
    }
    
}

