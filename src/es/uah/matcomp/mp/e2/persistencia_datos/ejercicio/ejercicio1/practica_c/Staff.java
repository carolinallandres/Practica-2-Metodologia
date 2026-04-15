package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_c;

public class Staff extends Person {
    //Atributos
    private String school;
    private double pay;


    //Constructores
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }


    //Métodos básicos
    public String getSchool() { //devuelve el colegio
        return school;
    }

    public void setSchool(String school) { //modifica el valor del colegio
        this.school = school;
    }

    public double getPay() { //devuelve el pago
        return pay;
    }

    public void setPay(double pay) { //modifica el valor del pago
        this.pay = pay;
    }


    //Métodos con funciones
    public String toString() { //devuelve los atributos del personal, incluyendo los de la clase persona (super.toString())
        return "Staff["+ super.toString() + ", school="+school+", pay="+pay+"]";
    }
}