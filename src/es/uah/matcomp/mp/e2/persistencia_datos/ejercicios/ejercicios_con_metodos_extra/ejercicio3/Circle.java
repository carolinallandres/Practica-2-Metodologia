package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio3;

public class Circle {

    //Atributos
    private double radius;
   
    //Constructores
    //Constructor por defecto de la clase
    public Circle() {
        this.radius = 1.0;
    }

    //Constructor usando el valor del radio dado 
    public Circle(double radius) {
        this.radius = radius;
    }

    //Métodos
    //Devuelve el radio
    public double getRadius() {
        return radius;
    }
    
    //Asigna un valor a la variable radio
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Cálculo del área del círculo
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    
    //Cálculo de la circunferencia del círculo
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

