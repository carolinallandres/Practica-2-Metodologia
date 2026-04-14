package es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4;

public class Ejemplo4_2 {

    public static void run() {
        System.out.println("Ejemplo 4.2 — finally ejecutándose aunque haya excepción");

        try { //
            methodA();
        } catch (ArithmeticException e) { //
            System.out.println("Excepción capturada en run(): " + e);
        }
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0); //provoca una ArithmeticException
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()"); //sale de la pila de llamadas
    }
}
