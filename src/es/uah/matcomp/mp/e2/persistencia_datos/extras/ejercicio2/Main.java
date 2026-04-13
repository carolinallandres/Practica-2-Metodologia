package es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio2;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // 1. Crear el objeto interno
        Direccion dir = new Direccion("Mayor", 12);

        // 2. Crear el objeto que contiene al otro
        Alumno alumno = new Alumno("Lucía", dir);


        //Si el programa escribe siempre el fichero antes de leerlo, no es posible modificar manualmente el JSON.
        // Para comprobar la persistencia, es necesario ejecutar solo la lectura sin sobrescribir el fichero.

        // 3. Guardar en JSON
        try (FileWriter fw = new FileWriter("alumno.json")) {
            gson.toJson(alumno, fw);
            System.out.println("Alumno guardado en alumno.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Cargar desde JSON
        try (FileReader fr = new FileReader("alumno.json")) {
            Alumno cargado = gson.fromJson(fr, Alumno.class);
            System.out.println("Alumno cargado desde JSON:");
            System.out.println(gson.toJson(cargado)); // Mostrarlo bonito
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}