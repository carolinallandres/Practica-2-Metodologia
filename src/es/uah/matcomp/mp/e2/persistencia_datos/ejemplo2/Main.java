package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo2;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        if (args.length != 2) { //se comprueba que el usuario ha pasado exactamente 2 argumentos: <operación> y <fichero>, sino muestra cómo usar el programa
            System.out.println("Uso: java Main <init|show> <fichero>");
            return; //se sale del bucle
        }

        String operacion = args[0]; //puede ser "init" o "show"
        String fichero = args[1]; //ruta del archivo JSON
        Gson gson = new Gson();

        if (operacion.equals("init")) { //si la operación es "init", se crea un archivo JSON con un Alumno por defecto

            Alumno a = new Alumno("Ariadna", 19, 10); //se crea un alumno con atributos para guardar en el archivo

            try (FileWriter fw = new FileWriter(fichero)) { //intenta abrir o crear un archivo para escribir en él
                gson.toJson(a, fw);  //se convierte el objeto a JSON y se guarda
                System.out.println("Fichero creado.");
            }
            catch (IOException e) { //se lanza una excepción si hay problemas con la escritura o lectura del archivo
                System.out.println("Error al crear el fichero.");
            }

        }

        else if (operacion.equals("show")) { //si la operación es "show", leemos el archivo JSON y mostramos su contenido
            try (FileReader fr = new FileReader(fichero)) { //intenta abrir un archivo para leer lo que hay en él
                Alumno a = gson.fromJson(fr, Alumno.class); //convierte el archivo JSON en objeto Java
                System.out.println(a); //se muestra el alumno que se ha leído
            }
            catch (IOException e) { //se lanza una excepción si hay problemas con la escritura o lectura del archivo
                System.out.println("No se pudo leer el fichero.");
            }

        }

        else { //como solo valen las operaciones "init" y "show", si no es ninguna no es válida y se avisa al usuario
            System.out.println("Operación no válida.");
        }
    }
}