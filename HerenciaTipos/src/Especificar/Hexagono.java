package Especificar;

public class Hexagono extends FiguraGeometrica{
    float perimetro;
    float apotema;
    
    public Hexagono(float perimetro, float apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
    }
    
    public float area(){
        return (perimetro * apotema)/2;
    }
}
