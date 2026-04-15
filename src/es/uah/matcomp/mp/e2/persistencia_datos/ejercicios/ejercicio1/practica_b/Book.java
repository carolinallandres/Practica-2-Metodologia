package es.uah.matcomp.mp.e2.persistencia_datos.ejercicios.ejercicio1.practica_b;

public class Book {
    //Atributos
    private String isbn;
    private String name;
    private Author author;    //Agregación del objeto Author
    private double price;
    private int qty;


    //Constructores
    public Book (String isbn, String name, Author author, double price){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        qty=0;
    }

    public Book (String isbn, String name, Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }


    //Métodos básicos
    public String getIsbn() { //devuelve el Isbn
        return isbn;
    }

    public String getName() { //devuelve el nombre
        return name;
    }

    public Author getAuthor() { //devuelve el autor
        return author;
    }

    public double getPrice() { //devuelve el precio
        return price;
    }

    public String getAuthorName(){ //modifica el valor del nombre del autor
        return author.getName();
    }

    public void setPrice(double price) { //modifica el valor del precio
        this.price = price;
    }

    public int getQty() { //devuelve la cantidad
        return qty;
    }

    public void setQty(int qty) { //modifica el valor de la cantidad
        this.qty = qty;
    }


    //Métodos con función
    public String toString(){ //devuelve el objeto con sus atributos
        return "Book[name="+name+","+author+",price="+price+",qty="+qty+"]";
    }
}
