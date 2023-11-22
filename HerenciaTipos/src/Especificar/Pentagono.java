package Especificar;

public class Pentagono extends FiguraGeometrica{
    int perimetro;
    float apotema;
    
    public Pentagono(int perimetro, float apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
    }
    
    public float area(){
        return (perimetro * apotema)/2;
        }
}