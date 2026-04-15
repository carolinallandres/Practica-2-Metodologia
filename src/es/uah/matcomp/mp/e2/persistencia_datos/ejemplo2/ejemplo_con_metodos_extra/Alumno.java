package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo2.ejemplo_con_metodos_extra;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;

    public Alumno() {
        // necesario para Gson
    }

    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiclo(String curso) {
        this.curso = curso;
    }
}
