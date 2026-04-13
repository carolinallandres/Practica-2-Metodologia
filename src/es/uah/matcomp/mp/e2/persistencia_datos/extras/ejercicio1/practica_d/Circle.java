package es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio1.practica_d;

public class Circle implements GeometricObject {
    protected double radius;

    //CONSTRUCTORES

    public Circle(double radius) {
        this.radius = radius;
    }

    //MÉTODOS

    public String toString() {
        return "Circle=[radius=" + radius + "]";
    }

    @Override
    public double getArea(){    //Devuelve el área del círculo
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){   //Devuelve el perimetro del círculo
        return 2*Math.PI*radius;
    }
}