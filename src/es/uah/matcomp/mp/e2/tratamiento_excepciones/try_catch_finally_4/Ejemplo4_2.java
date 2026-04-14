package es.uah.matcomp.mp.e2.tratamiento_excepciones.try_catch_finally_4;

public class Ejemplo4_2 {

    public static void run() {
        System.out.println("Ejemplo 4.2 — finally ejecutándose aunque haya excepción");

        try { //
            methodA();
        } catch (ArithmeticException ex) { //
            ex.printStackTrace();
            System.out.println("Excepción capturada en run(): " + ex);
        }
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0); //provoca una ArithmeticException
        } finally { //se ejecuta siempre, haya o no haya excepción
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()"); //no se ejecuta nunca porque la excepción interrumpe el flujo
    }
}
