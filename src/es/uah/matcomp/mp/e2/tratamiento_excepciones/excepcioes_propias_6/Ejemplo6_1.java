package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepcioes_propias_6;

class MiExcepcion extends Exception {
    public MiExcepcion(String msg) {
        super(msg);
    }
}

public class Ejemplo6_1 {

    public static void run() {
        System.out.println("Ejemplo 6.1 — Excepción personalizada");

        try {
            magia(8);
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void magia(int numero) throws MiExcepcion {
        if (numero == 8) {
            throw new MiExcepcion("Has encontrado el número mágico");
        }
        System.out.println("Número normal: " + numero);
    }
}