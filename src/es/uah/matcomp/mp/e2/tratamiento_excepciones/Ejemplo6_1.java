package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo6_1 {

    public static void run() {
        System.out.println("Ejemplo 6.1 — try-catch-finally");

        try { //intento ejecutar este bloque pero aquí puede haber excepciones
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file...");

            Scanner in = new Scanner(new File("test.in")); //intento abrir el archivo

            System.out.println("File found, processing...");
            System.out.println("End of the main logic");
        }
        catch (FileNotFoundException ex) { //si el archivo no existe, se captura aquí
            ex.printStackTrace();
            System.out.println("File Not Found caught...");
        }
        finally { //este bloque se ejecuta siempre, haya o no haya excepción
            System.out.println("finally-block runs regardless of exception");
        }
        System.out.println("After try-catch-finally, life goes on..."); //el programa continúa normalmente
    }
}