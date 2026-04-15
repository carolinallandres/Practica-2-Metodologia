package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_d;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // -------------------------
        // CIRCLE
        // -------------------------
        Circle circle = new Circle(5.0);

        try (FileWriter fw = new FileWriter("circle.json")) {
            gson.toJson(circle, fw);
            System.out.println("Circle guardado en JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("circle.json")) {
            Circle loadedCircle = gson.fromJson(fr, Circle.class);

            System.out.println("Circle cargado:");
            System.out.println(gson.toJson(loadedCircle));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------
        // RECTANGLE
        // -------------------------
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        try (FileWriter fw = new FileWriter("rectangle.json")) {
            gson.toJson(rectangle, fw);
            System.out.println("Rectangle guardado en JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("rectangle.json")) {
            Rectangle loadedRectangle = gson.fromJson(fr, Rectangle.class);

            System.out.println("Rectangle cargado:");
            System.out.println(gson.toJson(loadedRectangle));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}