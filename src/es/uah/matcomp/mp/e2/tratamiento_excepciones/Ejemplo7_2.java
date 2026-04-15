package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo7_2 {

    public static void run() {
        System.out.println("Ejemplo 5.2 — NullPointerException");

        String s = null; //variable String sin inicializar

        try { //intento usar la variable
            System.out.println(s.length());
        }
        catch (NullPointerException ex) { //la excepción NullPointerException se produce cuando intentamos usar un objeto que es nulo
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex);
        }
    }
}