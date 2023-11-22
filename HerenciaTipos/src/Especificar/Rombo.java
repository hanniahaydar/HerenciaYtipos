package Especificar;

public class Rombo extends FiguraGeometrica{
    float diagonalMayor;
    float diagonalMenor;
    
    public Rombo(float diagonalMayor, float diagonalMenor){
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
    }
    
    public float area(){
        return (diagonalMayor * diagonalMenor)/2;
    }
}