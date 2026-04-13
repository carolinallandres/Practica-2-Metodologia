package es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2;

public class Ejemplo2_2 {

    public static void run() {
        System.out.println("Ejemplo 2.2 — Pila de llamadas con ArithmeticException");
        try {
            mainLogic();
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en run(): " + e);
        }
    }

    private static void mainLogic() {
        System.out.println("Enter mainLogic()");
        methodA();
        System.out.println("Exit mainLogic()"); // NO se ejecuta si ocurre la excepción
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()"); // NO se ejecuta
    }

    private static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()"); // NO se ejecuta
    }

    private static void methodC() {
        System.out.println("Enter methodC()");
        System.out.println(1 / 0); // Provoca ArithmeticException
        System.out.println("Exit methodC()"); // NO se ejecuta
    }
}