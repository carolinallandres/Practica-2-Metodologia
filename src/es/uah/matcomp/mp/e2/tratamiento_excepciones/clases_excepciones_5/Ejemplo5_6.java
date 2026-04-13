package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_6 {

    private static boolean inicializado = false;

    public static void run() {
        System.out.println("Ejemplo 5.6 — IllegalStateException");

        try {
            usarRecurso();
        } catch (IllegalStateException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void usarRecurso() {
        if (!inicializado) {
            throw new IllegalStateException("El recurso no ha sido inicializado");
        }
    }
}
