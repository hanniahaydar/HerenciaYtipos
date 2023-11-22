package Especificar;

public class CoronaCircular extends FiguraGeometrica{
    float radioMayor;
    float radioMenor;
    float pi = 3.1416f;
    
    public CoronaCircular(float radioMayor, float radioMenor){
        this.radioMayor=radioMayor;
        this.radioMenor=radioMenor;
    }
    
    public float area(){
        return pi*((radioMayor*radioMayor) - (radioMenor*radioMenor));
    }
}