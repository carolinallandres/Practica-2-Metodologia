package es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5;

public class Ejemplo5_4 {

    public static void run() {
        System.out.println("Ejemplo 5.4 — ClassCastException");

        Object o = new Object(); //se crea un objeto genérico

        try { //intento comprobar si coincide el tipo del objeto
            Integer x = (Integer) o;
        }
        catch (ClassCastException ex) { //la excepción ClassCastException se genera porque o no es un Integrer
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex);
        }
    }
}