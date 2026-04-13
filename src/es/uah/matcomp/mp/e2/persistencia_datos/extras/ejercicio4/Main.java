package es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio4;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio4.necesario.ListSE;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // Crear lista personalizada
        ListSE<Estudiante> lista = new ListSE<>();
        lista.add(new Estudiante("Ana", 20));
        lista.add(new Estudiante("Luis", 21));

        // Crear asignatura
        Asignatura asignatura = new Asignatura("Matemáticas", lista);

        // Guardar JSON
        try (FileWriter fw = new FileWriter("asignatura.json")) {
            gson.toJson(asignatura, fw);
            System.out.println("Asignatura guardada.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cargar JSON
        try (FileReader fr = new FileReader("asignatura.json")) {
            Asignatura cargada = gson.fromJson(fr, Asignatura.class);
            System.out.println("Asignatura cargada:");
            System.out.println(gson.toJson(cargada));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}