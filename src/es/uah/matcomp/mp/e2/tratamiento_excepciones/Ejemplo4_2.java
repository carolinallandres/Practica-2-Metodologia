package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo4_2 {
    public static void run(){
        //Ejemplo de unchecked exception: ArrayIndexOutOfBounds
        System.out.println("Ejemplo 4.2 — Definición de Clases de Excepciones");

        try {
            //Pedimos que imprima el número en posición 9 de la lista
            int[] lista = {0, 2, 3, 7, 8, 10};
            System.out.println(lista[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            //No hay un número en esa posicion porque la lista termina en posición 5
            System.out.println("No se encontro la posicion dentro de la lista");
        }
    }
}
