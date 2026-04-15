package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo2;

//programar una clase de datos de alumno, con los atributos que consideres.

public class Alumno {
    //Atributos
    private String nombre;
    private int edad;
    private double nota;


    //Constructores
    public Alumno() {}

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }


    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() { //devuelve el alumno con sus atributos
        return "Alumno{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", nota=" + nota + '}';
    }
}