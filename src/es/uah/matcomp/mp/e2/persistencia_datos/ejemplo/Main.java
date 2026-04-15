package es.uah.matcomp.mp.e2.persistencia_datos.ejemplo;

//ejemplo que sirve para comprobar cómo se almacenan los datos

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson(); //se crea un objeto Gson que va permitir la conversión de JSON a Java y viceversa

        Persona p = new Persona("Antonio Moratilla", 97); //se crea un objeto Persona con atributos, el cual se convertirá a JSON

        String json = gson.toJson(p); //toJson recibe un objeto y devuelve su representación en formato JSON

        System.out.println(json); //se muestra el JSON generado por pantalla
    }
}
