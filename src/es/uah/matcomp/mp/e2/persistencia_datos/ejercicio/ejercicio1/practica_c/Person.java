package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_c;

public class Person {
    //Atributos
    private String name;
    private String address;


    //Constructores
    public Person() {
    }

    public Person(String name, String address) {
        this.name=name;
        this.address=address;
    }


    //Métodos básicos
    public void setName(String name) { //modifica el nombre
        this.name = name;
    }

    public String getName() { //devuelve el nombre
        return name;
    }

    public String getAddress() { //devuelve el valor de la dirección
        return address;
    }

    public void setAddress(String address) { //modifica el valor de la dirección
        this.address=address;
    }


    //Métodos con función
    @Override
    public String toString() { //devuelve los atributos de la persona
        return "Person[name="+name+", address="+address+"]";
    }
}