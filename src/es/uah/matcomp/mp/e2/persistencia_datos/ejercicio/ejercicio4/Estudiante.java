package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio4;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        return this.nombre.compareTo(o.nombre);
    }
}