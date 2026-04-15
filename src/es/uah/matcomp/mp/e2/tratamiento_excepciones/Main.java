package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5.*;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_propias_6.Ejemplo6_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_pilas_llamadas_3.Ejemplo3_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1.Ejemplo1_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1.Ejemplo1_2;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2.Ejemplo2_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2.Ejemplo2_2;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4.Ejemplo4_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4.Ejemplo4_2;

public class Main {

    public static void main(String[] args) {

        Ejemplo1_1.run();
        salto();

        try { //como habíamos usado un throws en el ejemplo 1_2, la excepción se ejecuta aquí
            Ejemplo1_2.run();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Ejemplo 1.2 lanzó excepción: " + ex);
        }
        salto();

        Ejemplo2_1.run();
        salto();

        Ejemplo2_2.run();
        salto();

        Ejemplo3_1.run();
        salto();

        Ejemplo4_1.run();
        salto();

        Ejemplo4_2.run();
        salto();

        Ejemplo5_1.run();
        salto();

        Ejemplo5_2.run();
        salto();

        Ejemplo5_3.run();
        salto();

        Ejemplo5_4.run();
        salto();

        Ejemplo6_1.run();
        salto();
    }

    private static void salto() {
        System.out.println("\n---------------------------------------\n");
    }
}