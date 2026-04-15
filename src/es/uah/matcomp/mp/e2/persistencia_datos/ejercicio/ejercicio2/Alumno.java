package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio2;

public class Alumno {
    //Atributos
    private String nombre;
    private Direccion direccion;

    //Constructores
    public Alumno(String nombre, Direccion direccion) { //este objeto contiene un objeto dentro como pide el ejercicio
        this.nombre = nombre;
        this.direccion = direccion;
    }
}