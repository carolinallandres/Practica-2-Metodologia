package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_d;

public class Circle implements GeometricObject {
    //Atributos
    protected double radius;


    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    //Métodos con función
    public String toString() { //devuelve el objeto con sus atributos
        return "Circle=[radius=" + radius + "]";
    }

    @Override
    public double getArea(){ //devuelve el área del círculo utilizando la interfaz
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){ //devuelve la longitud de la circunferencia utilizando la interfaz
        return 2*Math.PI*radius;
    }
}