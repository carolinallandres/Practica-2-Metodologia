package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo2_2 {

    public static void run() {
        System.out.println("Ejemplo 2.2 — Pila de llamadas con ArithmeticException");
        try { //intenta ejecutar el metodo principal
            mainLogic();
        }
        catch (ArithmeticException ex) { //se ejecuta si hay una excepción de tipo aritmética
            ex.printStackTrace(); //muestra la traza completa de la excepción
        }
    }

    private static void mainLogic() {
        System.out.println("Enter mainLogic()");
        methodA(); //el programa principal no maneja la excepción y llama al A después de entrar en la pila
        System.out.println("Exit mainLogic()"); //no se ejecuta si se produce la excepción
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB(); //el metodo A tampoco maneja la excepeción y llama al B después de entrar en la pila
        System.out.println("Exit methodA()");
    }

    private static void methodB() {
        System.out.println("Enter methodB()");
        methodC(); //el metodo B tampoco maneja la excepeción y llama al D después de entrar en la pila
        System.out.println("Exit methodB()");
    }

    private static void methodC() {
        System.out.println("Enter methodC()"); //entra en la pila
        System.out.println(1 / 0); //desencadena una ArithmeticException
        System.out.println("Exit methodC()"); //sale de la pila de llamadas y análogamente el C, el B, el A y el principal
    }
}