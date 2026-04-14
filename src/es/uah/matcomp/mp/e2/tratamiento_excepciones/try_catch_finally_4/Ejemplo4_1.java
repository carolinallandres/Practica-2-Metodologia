package es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo4_1 {

    public static void run() {
        System.out.println("Ejemplo 4.1 — try-catch-finally");

        try { //
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file...");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("File found, processing...");
            System.out.println("End of the main logic");
        } catch (FileNotFoundException e) { //
            System.out.println("File Not Found caught...");
        } finally { //
            System.out.println("finally-block runs regardless of exception");
        }
        System.out.println("After try-catch-finally, life goes on..."); //
    }
}
