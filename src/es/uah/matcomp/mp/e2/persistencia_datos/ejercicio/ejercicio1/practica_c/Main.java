package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_c;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // -------------------------
        // CREAR OBJETO STAFF
        // -------------------------
        Staff staff = new Staff(
                "Juan",
                "Barcelona",
                "IES Example",
                1200.5
        );

        // -------------------------
        // GUARDAR EN JSON
        // -------------------------
        try (FileWriter fw = new FileWriter("staff.json")) {
            gson.toJson(staff, fw);
            System.out.println("Staff guardado en JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------
        // LEER DESDE JSON
        // -------------------------
        try (FileReader fr = new FileReader("staff.json")) {
            Staff loadedStaff = gson.fromJson(fr, Staff.class);

            System.out.println("Staff cargado:");
            System.out.println(gson.toJson(loadedStaff));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}