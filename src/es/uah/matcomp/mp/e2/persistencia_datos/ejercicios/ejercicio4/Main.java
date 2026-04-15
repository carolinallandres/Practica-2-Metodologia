package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio4.necesario.ListSE;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        ListSE<Estudiante> lista = new ListSE<>(); //se crea una lista auxiliar donde almacenar los objetos
        lista.add(new Estudiante("Ana", 20)); //se añade un objeto con atributos a la lista auxiliar
        lista.add(new Estudiante("Luis", 21)); //se añade otro objeto con atributos a la lista auxiliar

        Asignatura asignatura = new Asignatura("Matemáticas", lista);  //se crea un objeto con una lista dentro


        try (FileWriter fw = new FileWriter("asignatura.json")) { //intentar abrir o crear un archivo para escribir en él
            gson.toJson(asignatura, fw); //convierte el archivo JSON en objeto
            System.out.println("Asignatura guardada.");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("asignatura.json")) { //intenta abrir un archivo para leer lo que hay en él
            Asignatura cargada = gson.fromJson(fr, Asignatura.class); //convierte el archivo JSON en objeto
            System.out.println("Asignatura cargada:");

            System.out.println(gson.toJson(cargada)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}

//el archivo JSON contiene un objeto principal que es la asignatura y dentro una lista JSON con los objetos estudiante
//si modifico manualmente los alumnos dentro del archivo JSON, cuando lo cargo otra vez obtengo nuevos objetos con los datos actualizados y una lista actualizada