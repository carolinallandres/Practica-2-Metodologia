package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio4;

import es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio4.necesario.ListSE;

public class Asignatura {
    //Atributos
    private String nombre;
    private ListSE<Estudiante> estudiantes;

    //Constructor
    public Asignatura(String nombre, ListSE<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }
}