package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio4;

public class Estudiante implements Comparable<Estudiante> { //la lista que estamos utilizando solo admite clases que admitan el metodo comparable
    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos
    @Override //necesitamos este metodo por el tipo de lista que usamos
    public int compareTo(Estudiante o) {
        return this.nombre.compareTo(o.nombre);
    }
}