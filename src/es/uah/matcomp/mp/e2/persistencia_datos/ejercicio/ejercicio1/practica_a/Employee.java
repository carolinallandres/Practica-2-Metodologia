package es.uah.matcomp.mp.e2.persistencia_datos.ejercicio.ejercicio1.practica_a;

public class Employee {
    //Atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    //Constructores
    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    //Métodos básicos
    public int getId () {return id;} //devuelve el id

    public String getFirstName () {return firstName;} //devuelve el nombre

    public String getLastName () {return lastName;} //devuelve el apellido

    public String getName () {return firstName + " " + lastName;} //devuelve el nombre

    public int getSalary () {return salary;} //devuelve el salario

    public void setSalary (int salary) {this.salary = salary;} //modifica el valor del salario

    public int getAnnualSalary () {return salary*12;} //devuelve el salario anual

    public int raiseSalary (int percent) {return this.salary = salary+(salary*percent)/100;} //devuelve el salario en función del incremento


    //Métodos con función
    public String toString () {return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";} //devuelve objeto con sus atributos
}