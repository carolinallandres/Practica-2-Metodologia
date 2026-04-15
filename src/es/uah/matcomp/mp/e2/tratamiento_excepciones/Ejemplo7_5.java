package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo7_5 {

    public static void run() {
        System.out.println("Ejemplo 7.5 — IllegalStateException");

        List <Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        Iterator<Integer> iterator = lista.iterator(); //Iterador para la lista, incializa en -1

        try{
            iterator.remove(); //Intentamos eliminar
        }
        catch (IllegalStateException ex){
            ex.printStackTrace();
            System.out.println("Excepción capturada" +  ex);
        }
    }

}
