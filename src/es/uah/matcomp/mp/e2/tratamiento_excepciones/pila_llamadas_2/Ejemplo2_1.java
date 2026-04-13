package es.uah.matcomp.mp.e2.tratamiento_excepciones.pila_llamadas_2;

public class Ejemplo2_1 {

    public static void run() {
        System.out.println("Ejemplo 2.1 — Pila de llamadas");
        mainLogic();
    }

    private static void mainLogic() {
        System.out.println("Enter mainLogic()");
        methodA();
        System.out.println("Exit mainLogic()");
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    private static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    private static void methodC() {
        System.out.println("Enter methodC()");
        System.out.println("Exit methodC()");
    }
}
