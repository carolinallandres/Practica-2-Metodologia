package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // ------------------------------------
        // 1. ARRAY SUELTO (va aquí, en el main)
        // ------------------------------------
        int[] numeros = {1, 2, 3, 4, 5};

        try (FileWriter fw = new FileWriter("numeros.json")) {
            gson.toJson(numeros, fw);
            System.out.println("Array suelto guardado en numeros.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cargar array suelto
        try (FileReader fr = new FileReader("numeros.json")) {
            int[] cargado = gson.fromJson(fr, int[].class);
            System.out.println("Array suelto cargado: " + Arrays.toString(cargado));
        } catch (IOException e) {
            e.printStackTrace();
        }


        // ------------------------------------
        // 2. ARRAY DENTRO DE UN OBJETO
        // ------------------------------------
        Grupo grupo = new Grupo("Grupo A", new int[]{5, 7, 9});

        try (FileWriter fw = new FileWriter("grupo.json")) {
            gson.toJson(grupo, fw);
            System.out.println("Grupo guardado en grupo.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cargar objeto con array
        try (FileReader fr = new FileReader("grupo.json")) {
            Grupo cargado = gson.fromJson(fr, Grupo.class);
            System.out.println("Grupo cargado:");
            System.out.println(gson.toJson(cargado));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}