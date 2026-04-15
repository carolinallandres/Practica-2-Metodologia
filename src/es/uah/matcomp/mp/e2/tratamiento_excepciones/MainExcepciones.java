package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class MainExcepciones {

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

        Ejemplo6_1.run();
        salto();


        Ejemplo6_2.run();
        salto();


        Ejemplo7_1.run();
        salto();


        Ejemplo7_2.run();
        salto();


        Ejemplo7_3.run();
        salto();


        Ejemplo7_4.run();
        salto();

        Ejemplo7_5.run();
        salto();


        Ejemplo8_1.run();
        salto();

        Ejemplo8_2.run();
        salto();
    }


    private static void salto() {
        System.out.println("\n---------------------------------------\n");
    }
}