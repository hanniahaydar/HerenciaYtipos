package Especificar;
public class Trapecio extends FiguraGeometrica{
    float baseMayor;
    float baseMenor;
    float altura;
   
    public Trapecio(float baseMayor, float baseMenor, float altura){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
    }
    
    public float area(){
        return ((baseMayor + baseMenor) * altura)/2;
    }
        
}