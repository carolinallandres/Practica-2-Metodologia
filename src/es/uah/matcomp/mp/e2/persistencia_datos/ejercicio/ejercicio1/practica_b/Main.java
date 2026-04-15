package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_b;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // -------------------------
        // AUTHOR + BOOK
        // -------------------------

        Author author = new Author("George Orwell", "orwell@email.com");
        Book book = new Book("978-0451524935", "1984", author, 15.99, 10);

        // GUARDAR EN JSON
        try (FileWriter fw = new FileWriter("book.json")) {
            gson.toJson(book, fw);
            System.out.println("Book guardado en JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CARGAR DESDE JSON
        try (FileReader fr = new FileReader("book.json")) {
            Book loadedBook = gson.fromJson(fr, Book.class);

            System.out.println("Book cargado desde JSON:");
            System.out.println(gson.toJson(loadedBook));

            // Mostrar también datos internos
            System.out.println("Autor del libro: " + loadedBook.getAuthorName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}