package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_a;

public class Rectangle {

    //Atributos
    private float length;
    private float width;

    //Valores por defecto de los atributos
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //Getters y Setters para los valores de ancho y largo del rectángulo
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //Cálculo del área del rectángulo
    public double getArea() {
        return length*width;
    }

    //Cálculo del perimetro del rectángulo
    public double getPerimeter() {
        return 2*length+2*width;
    }

    public String toString() {
        return "Rectangle[length=" + length + "width=" + width + "]";
    }
}