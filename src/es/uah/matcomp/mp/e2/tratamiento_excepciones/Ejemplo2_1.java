package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo2_1 {

    public static void run() {
        System.out.println("Ejemplo 2.1 — Pila de llamadas");
        mainLogic(); //llamo al metodo principal
    }

    private static void mainLogic() {
        System.out.println("Enter mainLogic()");
        methodA(); //el metodo principal llama al metodo A después de meterse en la pila
        System.out.println("Exit mainLogic()");
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB(); //el metodo A llama al metodo B después de meterse en la pila
        System.out.println("Exit methodA()");
    }

    private static void methodB() {
        System.out.println("Enter methodB()");
        methodC(); //el metodo B llama al metodo C después de meterse en la pila
        System.out.println("Exit methodB()");
    }

    private static void methodC() {
        System.out.println("Enter methodC()"); //el metodo C se mete en la pila
        System.out.println("Exit methodC()"); //el metodo C sale de la pila siguiendo el sistema LIFO, y análogamente el B, el A y el principal
    }
}
