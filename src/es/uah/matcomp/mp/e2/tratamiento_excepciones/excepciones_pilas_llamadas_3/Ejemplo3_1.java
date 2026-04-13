package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_pilas_llamadas_3;

// Creamos una excepción personalizada para que sea más claro el flujo.
class MiExcepcionEspecial extends Exception {
    public MiExcepcionEspecial(String msg) {
        super(msg);
    }
}

public class Ejemplo3_1 {

    public static void run() {
        System.out.println("Ejemplo 3.1 — Propagación de excepciones");

        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Excepción capturada en run(): " + e.getMessage());
        }
    }

    // methodA SÍ maneja la excepción
    private static void methodA() throws MiExcepcionEspecial {
        System.out.println("Enter methodA()");
        try {
            methodB();
        } catch (MiExcepcionEspecial ex) {
            System.out.println("Excepción capturada en methodA(): " + ex.getMessage());
        }
        System.out.println("Exit methodA()");
    }

    // methodB NO maneja la excepción → la declara
    private static void methodB() throws MiExcepcionEspecial {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()"); // NO se ejecutará si methodC lanza excepción
    }

    // methodC NO maneja la excepción → la declara
    private static void methodC() throws MiExcepcionEspecial {
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()"); // NO se ejecutará
    }

    // methodD LANZA la excepción
    private static void methodD() throws MiExcepcionEspecial {
        System.out.println("Enter methodD()");
        throw new MiExcepcionEspecial("Error lanzado desde methodD()");
        // No hay "Exit methodD()" porque la excepción interrumpe el flujo
    }
}