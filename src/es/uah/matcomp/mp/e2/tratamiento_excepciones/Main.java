package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import es.uah.matcomp.mp.e2.tratamiento_excepciones.clases_excepciones_5.*;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.excepcioes_propias_6.Ejemplo6_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_pilas_llamadas_3.Ejemplo3_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1.Ejemplo1_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1.Ejemplo1_2;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.introduccion_1.Ejemplo1_3;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2.Ejemplo2_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2.Ejemplo2_2;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4.Ejemplo4_1;
import es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4.Ejemplo4_2;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJECUCIÓN DE LA PRÁCTICA PL2 ===\n");

        Ejemplo1_1.run();
        salto();

        Ejemplo1_2.run();
        salto();

        // Ejemplo 1.3 lanza FileNotFoundException → lo capturamos aquí
        try {
            Ejemplo1_3.run();
        } catch (Exception e) {
            System.out.println("Ejemplo 1.3 lanzó excepción: " + e);
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

        Ejemplo5_5.run();
        salto();

        Ejemplo5_6.run();
        salto();

        Ejemplo6_1.run();
        salto();

        System.out.println("=== FIN DE LA PRÁCTICA ===");
    }

    // Método auxiliar para separar visualmente cada ejemplo
    private static void salto() {
        System.out.println("\n----------------------------------------\n");
    }
}