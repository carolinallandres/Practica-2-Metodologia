package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_a;

public class Rectangle {
    //Atributos
    private float length;
    private float width;


    //Constructores
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    //Métodos básicos
    public float getLength() { //devuelve el largo
        return length;
    }

    public void setLength(float length) { //modifica el valor del largo
        this.length = length;
    }

    public float getWidth() { //devuelve el ancho
        return width;
    }

    public void setWidth(float width) { //modifica el valor del ancho
        this.width = width;
    }

    public double getArea() { //devuelve el área del rectángulo
        return length*width;
    }

    public double getPerimeter() { //devuelve el perímetro del rectángulo
        return 2*length+2*width;
    }


    //Métodos con función
    public String toString() { //devuelve el objeto con sus atributos
        return "Rectangle[length=" + length + "width=" + width + "]";
    }
}