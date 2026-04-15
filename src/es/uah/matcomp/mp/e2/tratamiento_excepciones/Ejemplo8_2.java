package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo8_2 {

    public static void run(){
        System.out.println("Ejemplo 8.2 — Excepción personalizada");

        try{
            leerNombre();
        }
        catch (MiExcepcion ex){
            System.out.println("Excepcion: "+ex);
        }
    }

    public static void leerNombre() throws MiExcepcion {
        String nombre[] = {"Paco","Rosa","Miguel","Lucía","Carmen"};

        for(int i=0; i<nombre.length; i++){
            if(nombre[i].equals("Carmen")){
                MiExcepcion ex1 = new MiExcepcion("El nombre no me gusta");
                throw ex1;
            }
        }

        System.out.println("El nombre me gusta");
    }

}
