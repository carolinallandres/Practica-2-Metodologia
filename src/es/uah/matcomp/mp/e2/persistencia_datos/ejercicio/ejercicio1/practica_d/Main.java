package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_d;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        Circle circle = new Circle(5.0); //se crea un objeto con atributos


        try (FileWriter fw = new FileWriter("circle.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(circle, fw); //se convierte el objeto en JSON
            System.out.println("Circle guardado en JSON");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("circle.json")) { //intenta abrir un archivo para leer lo que hay en él
            Circle loadedCircle = gson.fromJson(fr, Circle.class); //convierte el archivo JSON en objeto
            System.out.println("Circle cargado:");

            System.out.println(gson.toJson(loadedCircle)); //se muestra el objeto en formato JSON

        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        Rectangle rectangle = new Rectangle(4.0, 6.0); //se crea un objeto con atributos


        try (FileWriter fw = new FileWriter("rectangle.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(rectangle, fw); //se convierte el objeto en JSON
            System.out.println("Rectangle guardado en JSON");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("rectangle.json")) { //intenta abrir un archivo para leer lo que hay en él
            Rectangle loadedRectangle = gson.fromJson(fr, Rectangle.class); //convierte el archivo JSON en objeto
            System.out.println("Rectangle cargado:");

            System.out.println(gson.toJson(loadedRectangle)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}