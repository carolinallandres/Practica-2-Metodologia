package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo7_4 {

    public static void run() {
        System.out.println("Ejemplo 7.4 — ClassCastException");

        Object o = new Object(); //se crea un objeto genérico

        try { //intento comprobar si coincide el tipo del objeto
            Integer x = (Integer) o;
            System.out.println(x);
        }
        catch (ClassCastException ex) { //la excepción ClassCastException se genera porque o no es un Integrer
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex);
        }
    }
}