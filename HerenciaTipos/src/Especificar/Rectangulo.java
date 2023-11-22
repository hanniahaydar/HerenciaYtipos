package Especificar;

public class Rectangulo extends FiguraGeometrica{
    float base;
    float altura;
    
    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    public float area(){
        Area = base*altura;
       return Area; 
    }
}