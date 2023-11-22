package Especializar;

public class Controladora {

    public static void main(String[] args) {
        Circulo circle = new Circulo(3.5f);
        circle.area();
        
        Cuadrado square = new Cuadrado(5);
        square.area();
        
        Triangulo triangle = new Triangulo(4,6);
        triangle.area();
        
        Rectangulo rectangle = new Rectangulo(5,4);
        rectangle.area();
    }
}