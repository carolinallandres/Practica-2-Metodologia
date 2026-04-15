package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_a;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // -------------------------
        // RECTANGLE
        // -------------------------
        Rectangle rect = new Rectangle(5.0f, 3.0f);

        try (FileWriter fw = new FileWriter("rectangle.json")) {
            gson.toJson(rect, fw);
            System.out.println("Rectangle guardado");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("rectangle.json")) {
            Rectangle cargado = gson.fromJson(fr, Rectangle.class);
            System.out.println("Rectangle cargado:");
            System.out.println(gson.toJson(cargado));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------
        // EMPLOYEE
        // -------------------------
        Employee emp = new Employee(1, "Carlos", "García", 2000);

        try (FileWriter fw = new FileWriter("employee.json")) {
            gson.toJson(emp, fw);
            System.out.println("Employee guardado");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("employee.json")) {
            Employee cargado = gson.fromJson(fr, Employee.class);
            System.out.println("Employee cargado:");
            System.out.println(gson.toJson(cargado));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}