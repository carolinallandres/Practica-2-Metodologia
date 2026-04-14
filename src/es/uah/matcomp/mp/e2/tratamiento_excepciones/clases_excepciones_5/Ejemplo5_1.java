package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_1 {

    public static void run() {
        System.out.println("Ejemplo 5.1 — ArrayIndexOutOfBoundsException");

        int[] arr = {1, 2, 3}; //

        try { //
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) { //
            System.out.println("Excepción capturada: " + e);
        }
    }
}