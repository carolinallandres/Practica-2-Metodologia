package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_d;

public class Rectangle implements GeometricObject {
    //Atributos
    protected double width;
    protected double length;


    //Constructor
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }


    //Métodos con función
    public String toString(){ //devuelve el objeto con sus atributos
        return "Rectangle[width="+width+",length="+length+"]";
    }

    @Override
    public double getArea(){ //devuelve el área del rectángulo utilizando la interfaz
        return width*length;
    }

    @Override
    public double getPerimeter(){ //devuelve el perímetro del rectángulo utilizando la interfaz
        return 2*width+2*length;
    }
}