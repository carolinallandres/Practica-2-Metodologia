package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicios_con_metodos_extra.ejercicio4;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public String toString(){
        return nombre+", edad: "+edad;
    }
}
