package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_pilas_llamadas_3;

class MiExcepcion extends Exception { //se crea una excepción genérica para representar el flujo
    public MiExcepcion(String msg) {
        super(msg);
    } //
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

    private static void methodA() throws MiExcepcion {
        System.out.println("Enter methodA()");
        try {  //methodA sí que maneja la excepción
            methodB();
        } catch (MiExcepcion ex) {
            System.out.println("Excepción capturada en methodA(): " + ex.getMessage());
        }
        System.out.println("Exit methodA()"); //se retira de la pila de llamadas
    }

    private static void methodB() throws MiExcepcion { //tiene que declarar la excpeción para poder compilar el programa
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()"); //se retira de la pila de llamadas
    }

    private static void methodC() throws MiExcepcion { //tiene que declarar la excpeción para poder compilar el programa
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()"); //se retira de la pila de llamadas
    }

    private static void methodD() throws MiExcepcion {
        System.out.println("Enter methodD()");
        throw new MiExcepcion("Error lanzado desde methodD()"); //methodD() encuentra una condición anormal y lanza una excepción
        //no hace falta especificar que salga de la pila de llamadas porque la excepción interrumpe el flujo
    }
}