package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_a;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        Rectangle rect = new Rectangle(5.0f, 3.0f); //se crea un objeto con atributos


        try (FileWriter fw = new FileWriter("rectangle.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(rect, fw); //se convierte el objeto en JSON
            System.out.println("Rectangle guardado");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("rectangle.json")) { //intenta abrir un archivo para leer lo que hay en él
            Rectangle cargado = gson.fromJson(fr, Rectangle.class); //convierte el archivo JSON en objeto
            System.out.println("Rectangle cargado:");

            System.out.println(gson.toJson(cargado)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        Employee emp = new Employee(1, "Carlos", "García", 2000); //se crea un objeto con atributos


        try (FileWriter fw = new FileWriter("employee.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(emp, fw); //se convierte el objeto en JSON
            System.out.println("Employee guardado");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("employee.json")) { //intenta abrir un archivo para leer lo que hay en él
            Employee cargado = gson.fromJson(fr, Employee.class); //convierte el archivo JSON en objeto
            System.out.println("Employee cargado:");

            System.out.println(gson.toJson(cargado)); //se muestra el objeto en formato JSON
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}