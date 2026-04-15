package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo1;

//ejemplo compacto de almacenamiento y carga de fichero

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {

    // Metodo genérico para guardar cualquier objeto en un archivo JSON.
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) { //recibe la ruta del archivo y el objeto que queremos guardar.
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) { //intenta crear o abrir un archivo para escribir en él
            gson.toJson(objeto, writer);  //se convierte el objeto a JSON y lo guardamos
        }
        catch (IOException ex) { //la excepción IOException se produce cuando hay un problema en la entrada o salida de datos
            ex.printStackTrace();
        }
    }

    // Metodo genérico para cargar un objeto desde un archivo JSON.
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) { //recibe la ruta del archivo y la clase del objeto que queremos reconstruir.
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) { //intenta abrir un archivo para leer lo que hay en él
            return gson.fromJson(reader, clase); //se convierte el JSON en un objeto Java
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null; //si hay una excepción, se devuelve null
        }
    }

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Juan", 30, "juan@example.com"); // se crea un objeto con atributos.

        String rutaArchivo = "usuario.json"; //ruta del archivo donde se guarda el JSON.

        guardarObjetoEnArchivo(rutaArchivo, usuario); //se guarda el objeto en un archivo JSON.

        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class); //se carga el objeto desde el archivo JSON.

        if (usuarioCargado != null) { //si se ha cargado se muestra el nombre del usuario
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }

    // Clase interna Usuario usada solo para este ejemplo.
    static class Usuario {
        //Atributos
        String nombre;
        int edad;
        String correo;

        // Constructor
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }

        // Getters y setters no incluidos por simplicidad.
    }
}

//se utilizan tantos métodos estáticos porque en ningún momento se crea un objeto, y así pueden ser llamados directamente sin la necesidad de crearlo

//el archivo JSON se guarda por defecto en la carpeta out del programa que se ejecuta
//en este caso, una vez modificado el orden para que la estructura quede más limpia, el archivo se guarda en la propia carpeta del ejemplo en el que estamos