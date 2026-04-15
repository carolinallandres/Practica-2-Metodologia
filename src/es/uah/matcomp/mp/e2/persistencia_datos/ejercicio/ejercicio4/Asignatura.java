package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio4;

import es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio4.necesario.ListSE;

public class Asignatura {
    private String nombre;
    private ListSE<Estudiante> estudiantes;

    public Asignatura(String nombre, ListSE<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }
}