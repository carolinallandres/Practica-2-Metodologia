package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo7_1 {

    public static void run() {
        System.out.println("Ejemplo 7.1 — ArrayIndexOutOfBoundsException");

        int[] arr = {1, 2, 3}; //array con 3 elementos (índices 0, 1 y 2)

        try { //intento acceder a una posición por índice del array
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex) { //la excepción ArrayIndexOutOfBoundsException se prodcuce cuando el índice no es válido
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex); //muestra el tipo de excepción y el mensaje
        }
    }
}
