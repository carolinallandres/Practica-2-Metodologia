package es.uah.matcomp.mp.e2.tratamiento_excepciones.excepcioes_propias_6;

// Excepción personalizada
class MiExcepcionMagica extends Exception {
    public MiExcepcionMagica(String msg) {
        super(msg);
    }
}

public class Ejemplo6_1 {

    public static void run() {
        System.out.println("Ejemplo 6.1 — Excepción personalizada");

        try {
            magia(8);
        } catch (MiExcepcionMagica e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    private static void magia(int numero) throws MiExcepcionMagica {
        if (numero == 8) {
            throw new MiExcepcionMagica("Has encontrado el número mágico");
        }
        System.out.println("Número normal: " + numero);
    }
}