package Especificar;

public class Cuadrado extends FiguraGeometrica{
    float lado;
    
    public Cuadrado (float lado){
        this.lado=lado;
    }
    public float area(){
        return lado*lado;
    }
}
