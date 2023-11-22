package Especificar;
public class Triangulo extends FiguraGeometrica{
    float base;
    float altura;
    
    public Triangulo(int base, int altura){
        this.base=(float)base;
        this.altura=(float)altura;
    }
    public float area(){
        Area = (base*altura)/2;
    return Area;
        
    }
    
}