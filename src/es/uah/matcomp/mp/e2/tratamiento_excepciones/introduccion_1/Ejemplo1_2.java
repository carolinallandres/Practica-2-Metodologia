package es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_2 {

    public static void run() {
        System.out.println("Ejemplo 1.2 — Scanner con try-catch");

        try {
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("Archivo encontrado y abierto correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}