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
        methodA(); //el main tampoco maneja la excepeción
        System.out.println("Exit mainLogic()"); //no se ejecuta si se produce la excepción
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB(); //el métodoA tampoco maneja la excepeción
        System.out.println("Exit methodA()"); //se retira de la pila de llamadas
    }

    private static void methodB() {
        System.out.println("Enter methodB()");
        methodC(); //el métodoB tampoco maneja la excepeción
        System.out.println("Exit methodB()"); //se retira de la pila de llamadas
    }

    private static void methodC() {
        System.out.println("Enter methodC()");
        System.out.println(1 / 0); //desencadena una ArithmeticException
        System.out.println("Exit methodC()"); //se retira de la pila de llamadas
    }
}