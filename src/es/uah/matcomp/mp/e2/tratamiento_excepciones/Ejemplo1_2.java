package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_2 {

    public static void run() throws FileNotFoundException {
        //Si el archivo no existe como se ha declarado throws FileNotFoundException se envía la excepción al main que es el que hace la llamada al metodo run()
        System.out.println("Ejemplo 1.2 — Scanner con throws");

        Scanner in = new Scanner(new File("test.in")); //Se intenta abrir el archivo directamente sin utilizar try...catch
        System.out.println("Archivo abierto correctamente (si no existe, la excepción se propagará).");
    }
}