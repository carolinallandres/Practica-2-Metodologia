package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo1_1 {

    // para todos los ejemplos de esta practica, el metodo main del proyecto llama a run() para ejecutar cada ejemplo por separado,
    // de manera que evito que cada ejemplo tenga su propio main

    public static void run() {
        System.out.println("Ejemplo 1.1 — Scanner con try-catch");

        try { //intento abrir el archivo, en caso de que no exista se ejecuta al catch
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("Archivo encontrado y abierto correctamente.");
        }
        catch (FileNotFoundException ex) { //la excepción FileNotFoundExcepcion aparece que el archivo no ha sido encontrado
            ex.printStackTrace(); //muestra la traza completa de la excepción
        }
    }
}