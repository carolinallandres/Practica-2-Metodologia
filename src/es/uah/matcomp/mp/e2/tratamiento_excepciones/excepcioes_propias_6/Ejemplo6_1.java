package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepcioes_propias_6;

class MiExcepcion extends Exception { //creo mi propia excepción personalizada, que hereda de Exception
    public MiExcepcion(String msg) {
        super(msg); //guardo el mensaje de la excepción en la clase padre Exception
    }
}

public class Ejemplo6_1 {

    public static void run() {
        System.out.println("Ejemplo 6.1 — Excepción personalizada");

        try {
            magia(8); //llamo al metodo que puede lanzar mi excepción
        }
        catch (MiExcepcion ex) { //capturo la excepción personalizada si el metodo magia la lanza
            ex.printStackTrace();
            System.out.println("Excepción capturada: " + ex.getMessage());
        }
    }

    private static void magia(int numero) throws MiExcepcion { //declaro que este metodo puede lanzar mi excepción
        if (numero == 8) {  //si se cumple la condición, lanzo mi excepción personalizada
            throw new MiExcepcion("Has encontrado el número mágico");
        }
        System.out.println("Número normal: " + numero); //si no es 8 se continúa normal
    }
}