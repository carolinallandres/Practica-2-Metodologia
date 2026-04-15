package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo;

public class Persona {
    //Atributos
    private String nombre = "John Doe";
    private int edad = 18;


    //Constructores
    //Gracias a los constructores, Gson puede leer los valores del fichero JSON y asignarlos a los atributos
    // correspondientes, para crear un objeto Persona con los datos cargados del archivo, por lo que son necesarios

    public Persona(String nombre, int edad) { //constructor necesario para ejecutar desde el main
        this.nombre = nombre;
        this.edad = edad;
    }


    //Métodos
    //se utilizan para leer y modificar los distintos atributos

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
}