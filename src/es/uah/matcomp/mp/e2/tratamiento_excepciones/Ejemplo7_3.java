package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo7_3 {

    public static void run() {
        System.out.println("Ejemplo 7.3 — NumberFormatException");

        try { //intento convertir un texto a número
            int n = Integer.parseInt("abc");
            System.out.println(n);
        }
        catch (NumberFormatException ex) { //la excepción NumberFormatException se produce cuando el formato del texto no es válido para convertirlo a int
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex);
        }
    }
}