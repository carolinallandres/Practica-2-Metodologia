package es.uah.matcomp.mp.e2.tratamiento_excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo4_1 {
    public static void run(){
        //Ejemplo de checked exception: FileNotFound
        System.out.println("Ejemplo 4.1 — Definición de Clases de Excepciones");

        try{
            //Busca un archivo llamado ArchivoVacio
            FileReader archivo = new FileReader("ArchivoVacio.txt");
            System.out.println("Archivo encontrado"); //Nunca se ejecuta
        }
        catch (FileNotFoundException e){
            //No se encuentra el archivo, excepcion
            System.out.println("No se encontro el archivo");
        }
    }
}
