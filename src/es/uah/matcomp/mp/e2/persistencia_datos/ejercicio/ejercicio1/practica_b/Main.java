package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_b;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea el objeto que se va a convertir a JSON y viceversa

        Author author = new Author("George Orwell", "orwell@email.com"); //se crea un objeto con atributos
        Book book = new Book("978-0451524935", "1984", author, 15.99, 10); //se crea un objeto con atributos


        try (FileWriter fw = new FileWriter("book.json")) { //intenta abrir o crear un archivo para escribir en él
            gson.toJson(book, fw); //se convierte el objeto en JSON
            System.out.println("Book guardado en JSON");
        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }


        try (FileReader fr = new FileReader("book.json")) { //intenta abrir un archivo para leer lo que hay en él
            Book loadedBook = gson.fromJson(fr, Book.class); //convierte el archivo JSON en objeto
            System.out.println("Book cargado desde JSON:");

            System.out.println(gson.toJson(loadedBook)); //se muestra el objeto en formato JSON

        }
        catch (IOException ex) { //si encuentra un error en la lectura o escritura del archivo se lanza una excepción
            ex.printStackTrace();
        }
    }
}