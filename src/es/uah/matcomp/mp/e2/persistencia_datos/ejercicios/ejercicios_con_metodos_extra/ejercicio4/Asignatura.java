package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio4;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;

    public Asignatura(String nombre, Estudiante[] estudiantes) {
        this.nombre=nombre;
        this.estudiantes=estudiantes;
    }

    public String getNombre() { return nombre; }
    public Estudiante[] getEstudiantes() { return estudiantes; }
}