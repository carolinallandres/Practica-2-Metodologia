package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        int[] numeros = {1, 2, 3, 4, 5}; //array suelto

        try (FileWriter fw = new FileWriter("numeros.json")) { //intentar abrir o crear un archivo para escribir en él
            gson.toJson(numeros, fw); //se convierte el objeto en JSON
            System.out.println("Array suelto guardado en numeros.json");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }

        try (FileReader fr = new FileReader("numeros.json")) { //intenta abrir un archivo para leer lo que hay en él
            int[] cargado = gson.fromJson(fr, int[].class); //convierte el archivo JSON en objeto
            System.out.println("Array suelto cargado: ");

            System.out.println(Arrays.toString(cargado)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        Grupo grupo = new Grupo("Grupo A", new int[]{5, 7, 9}); //array dentro de un objeto

        try (FileWriter fw = new FileWriter("grupo.json")) { //intentar abrir o crear un archivo para escribir en él
            gson.toJson(grupo, fw); //se convierte el objeto en JSON
            System.out.println("Grupo guardado en grupo.json");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("grupo.json")) { //intenta abrir un archivo para leer lo que hay en él
            Grupo cargado = gson.fromJson(fr, Grupo.class); //convierte el archivo JSON en objeto
            System.out.println("Grupo cargado:");

            System.out.println(gson.toJson(cargado)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}

//si el array se guarda suelto se convierte en una lista JSON
//si el array está dentro de un objeto, Gson crea como un array JSON anidado dentro del objeto en el que está el array