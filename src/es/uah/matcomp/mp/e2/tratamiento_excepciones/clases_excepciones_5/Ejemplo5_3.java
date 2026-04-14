package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_3 {

    public static void run() {
        System.out.println("Ejemplo 5.3 — NumberFormatException");

        try { //intento convertir un texto a número
            int n = Integer.parseInt("abc");
        }
        catch (NumberFormatException ex) { //la excepción NumberFormatException se produce cuando el formato del texto no es válido para convertirlo a int
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex);
        }
    }
}