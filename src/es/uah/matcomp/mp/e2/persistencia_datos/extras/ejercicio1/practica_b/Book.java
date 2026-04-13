package es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio1.practica_b;

public class Book {
    private String isbn;
    private String name;
    private Author author;    //Agregación del objeto Author
    private double price;
    private int qty;

    //CONSTRUCTORES

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

    //GETTERS

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //Getters del objeto Author

    public String getAuthorName(){
        return author.getName();
    }

    //SETTERS

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    //MÉTODOS

    public String toString(){
        return "Book[name="+name+","+author+",price="+price+",qty="+qty+"]";
    }
}
