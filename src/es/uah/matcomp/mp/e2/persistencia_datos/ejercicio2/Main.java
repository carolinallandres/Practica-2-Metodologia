package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio2;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);

        // Comprobamos número de argumentos
        if (args.length != 2) {
            System.out.println("Uso: java -jar TuProyecto.jar <operacion> <fichero>");
            System.out.println("  <operacion>: init | show");
            System.out.println("  <fichero>: ruta del archivo JSON");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        switch (operacion) {
            case "init":
                ejecutarInit(rutaFichero);
                break;
            case "show":
                ejecutarShow(rutaFichero);
                break;
            default:
                System.out.println("Operación no reconocida: " + operacion);
                System.out.println("Operaciones válidas: init | show");
        }
    }

    private static void ejecutarInit(String rutaFichero) {
        // Creamos un alumno con valores por defecto
        Alumno alumno = new Alumno("Ariadna", 19, 10);

        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaFichero)) {
            gson.toJson(alumno, writer);
            System.out.println("Fichero creado con éxito en: " + rutaFichero);
            System.out.println("Contenido guardado: " + alumno);
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }

    private static void ejecutarShow(String rutaFichero) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaFichero)) {
            Alumno alumno = gson.fromJson(reader, Alumno.class);
            if (alumno != null) {
                System.out.println("Alumno leído desde el fichero:");
                System.out.println(alumno);
            } else {
                System.out.println("No se pudo leer un alumno válido del fichero.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}