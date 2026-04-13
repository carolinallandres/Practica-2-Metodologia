package es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_3 {

    public static void run() throws FileNotFoundException {
        System.out.println("Ejemplo 1.3 — Scanner con throws");

        Scanner in = new Scanner(new File("test.in"));
        System.out.println("Archivo abierto correctamente (si no existe, la excepción se propagará).");
    }
}
