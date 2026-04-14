package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_4 {

    public static void run() {
        System.out.println("Ejemplo 5.4 — ClassCastException");

        Object o = new Object(); //

        try { //
            Integer x = (Integer) o; //
        } catch (ClassCastException e) { //
            System.out.println("Excepción capturada: " + e);
        }
    }
}