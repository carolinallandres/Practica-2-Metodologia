package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_b;

public class Author {
    //Atributos
    private String name;
    private String email;


    //Constructores
    public Author (String name,String email){
        this.name=name;
        this.email=email;
    }


    //Métodos básicos
    public String getName() { //devuelve el nombre
        return name;
    }

    public String getEmail() { //devuelve el email
        return email;
    }

    public void setEmail(String email){ //modifica el valor del email
        this.email=email;
    }


    //Métodos con función
    public String toString(){ //devuelve el objeto con sus atributos
        return "Author[name="+name+",email="+email+"]";
    }
}