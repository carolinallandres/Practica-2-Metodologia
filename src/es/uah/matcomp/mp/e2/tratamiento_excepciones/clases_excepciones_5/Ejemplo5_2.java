package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_2 {

    public static void run() {
        System.out.println("Ejemplo 5.2 — NullPointerException");

        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Excepción capturada: " + e);
        }
    }
}