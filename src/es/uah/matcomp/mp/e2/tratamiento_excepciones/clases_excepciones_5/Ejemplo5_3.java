package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_3 {

    public static void run() {
        System.out.println("Ejemplo 5.3 — NumberFormatException");

        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Excepción capturada: " + e);
        }
    }
}