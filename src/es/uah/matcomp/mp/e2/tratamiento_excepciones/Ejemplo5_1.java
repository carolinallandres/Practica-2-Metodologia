package es.uah.matcomp.mp.e2.tratamiento_excepciones;

public class Ejemplo5_1 {
    //Operaciones de manejo de excepciones
    public static void run(){
        System.out.println("Ejemplo 5.1 — Operaciones de manejo de excepciones");

        try{
            //Probamos si se cumple la condición de checkEdad, es decir, ser mayor de 18 años
            checkEdad(13);
            System.out.println("Acceso permitido:  "); //No se ejecuta
        }
        catch(IllegalArgumentException e){
            System.out.println("Acceso denegado:  " + e.getMessage());
        }
    }

    //checkEdad lanza una excepción cuando el usuario tiene menos de 18
    public static void checkEdad(int edad) throws IllegalArgumentException{
        if(edad<18){
            throw new IllegalArgumentException("Usuario menor de edad");
        }

        System.out.println("Usuario mayor de edad");
    }
}
