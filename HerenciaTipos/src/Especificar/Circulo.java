package Especificar;
public class Circulo extends FiguraGeometrica{
    float pi= 3.1416f;
    float radio;
    
    public Circulo(float radio){
        this.radio=radio;
    }
    
    public float area(){
        return pi*radio*radio;
    }
}