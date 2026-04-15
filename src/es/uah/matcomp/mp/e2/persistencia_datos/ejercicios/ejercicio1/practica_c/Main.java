package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_c;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        Staff staff = new Staff( //se crea un objeto con atributos
                "Juan",
                "Barcelona",
                "IES Example",
                1200.5
        );


        try (FileWriter fw = new FileWriter("staff.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(staff, fw); //se convierte el objeto en JSON
            System.out.println("Staff guardado en JSON");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("staff.json")) { //intenta abrir un archivo para leer lo que hay en él
            Staff loadedStaff = gson.fromJson(fr, Staff.class); //convierte el archivo JSON en objeto
            System.out.println("Staff cargado:");

            System.out.println(gson.toJson(loadedStaff)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}