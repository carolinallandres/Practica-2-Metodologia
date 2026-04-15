package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio2;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        Direccion dir = new Direccion("Mayor", 12); //se crea un objeto con atributos

        Alumno alumno = new Alumno("Lucía", dir); //se crea un objeto con otro objeto dentro

        try (FileWriter fw = new FileWriter("alumno.json")) { //intentar abrir o crear un archivo para escribir en él
            gson.toJson(alumno, fw);  //se convierte el objeto en JSON
            System.out.println("Alumno guardado en alumno.json");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }

        try (FileReader fr = new FileReader("alumno.json")) { //intenta abrir un archivo para leer lo que hay en él
            Alumno cargado = gson.fromJson(fr, Alumno.class); //convierte el archivo JSON en objeto
            System.out.println("Alumno cargado desde JSON:");

            System.out.println(gson.toJson(cargado)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}

//cuando un objeto contiene otros objetos, el archivo JSON también contiene esos objetos internos como estructuras JSON anidadas