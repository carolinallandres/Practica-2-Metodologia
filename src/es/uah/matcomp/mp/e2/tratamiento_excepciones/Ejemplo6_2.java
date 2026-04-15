package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo6_2 {

    public static void run() {
        System.out.println("Ejemplo 6.2 — finally ejecutándose aunque haya excepción");
        try {
            calcula(1,1);
            calcula(1,0);
        } catch (ArithmeticException ex) { //
            ex.printStackTrace();
            System.out.println("Excepción capturada en run(): " + ex);
        }
    }

    private static void calcula(int n,int m) {
        System.out.println("Enter methodA()");
        try {
            int result = n/m;
            System.out.println("El resultado de la operación es:" + result); //provoca una ArithmeticException en 1/0
        } finally { //se ejecuta siempre, haya o no haya excepción
            System.out.println("Finally en calcula()");
        }
        System.out.println("Exit calcula()"); //no se ejecuta nunca porque la excepción interrumpe el flujo
    }
}
