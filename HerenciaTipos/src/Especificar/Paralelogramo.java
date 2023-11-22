package Especificar;

	public class Paralelogramo extends FiguraGeometrica{
	    float base;
	    float altura;
	    
	    public Paralelogramo(float base, float altura){
	        this.base=base;
	        this.altura=altura;
	    }
	    
	    public float area(){
	       return base * altura;
	        
	    }
	    
	}