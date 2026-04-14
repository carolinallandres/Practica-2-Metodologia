package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepciones_pilas_llamadas_3;

class MiExcepcion extends Exception { //creo mi propia excepción para representar el flujo, que hereda de la clase Exception
    public MiExcepcion(String msg) {
        super(msg);
    } //guardo el mensaje de la excepción en la clase padre (Exception)
}

public class Ejemplo3_1 {

    public static void run() {
        System.out.println("Ejemplo 3.1 — Propagación de excepciones");

        try { //intenta ejecutar el metodo A
            methodA();
        }
        catch (Exception ex) { //si ocurre cualquier excepción
            ex.printStackTrace();
            System.out.println("Excepción capturada en run(): " + ex.getMessage()); //con ex.getMessage() obtengo el mensaje que se guardó cuando se lanzó la excepción
        }
    }

    private static void methodA() throws MiExcepcion {
        System.out.println("Enter methodA()");
        try {  //el metodo A sí que maneja la excepción e  intenta hacer el metodo B
            methodB();
        }
        catch (MiExcepcion ex) { //si metodo B o C lanzan MiExcepcion, la capturo aquí
            System.out.println("Excepción capturada en methodA(): " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Exit methodA()"); //se retira de la pila de llamadas
    }

    private static void methodB() throws MiExcepcion { //tiene que declarar la excepción para poder compilar el programa
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()"); //sale de la pila de llamadas
    }

    private static void methodC() throws MiExcepcion { //tiene que declarar la excepción para poder compilar el programa
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()"); //sale de la pila de llamadas
    }

    private static void methodD() throws MiExcepcion {
        System.out.println("Enter methodD()");
        throw new MiExcepcion("Error lanzado desde methodD()"); //el metodo D encuentra una condición anormal y lanza una excepción
        //no hace falta especificar que salga de la pila de llamadas porque la excepción interrumpe el flujo
    }
}