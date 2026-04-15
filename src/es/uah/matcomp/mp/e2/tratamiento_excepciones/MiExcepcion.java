package es.uah.matcomp.mp.e2.tratamiento_excepciones;

class MiExcepcion extends Exception { //creo mi propia excepción para representar el flujo, que hereda de la clase Exception
    public MiExcepcion(String msg) {
        super(msg); //guardo el mensaje de la excepción en la clase padre (Exception)
    }
}
