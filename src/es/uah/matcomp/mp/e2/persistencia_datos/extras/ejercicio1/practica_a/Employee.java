package es.uah.matcomp.mp.e2.persistencia_datos.extras.ejercicio1.practica_a;

public class Employee {

    //Atributos de la clase
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Getters y Setters
    public int getId () {return id;}

    public String getFirstName () {return firstName;}

    public String getLastName () {return lastName;}

    public String getName () {return firstName + " " + lastName;}

    public int getSalary () {return salary;}

    public void setSalary (int salary) {this.salary = salary;}

    //Cálculo del salario anual
    public int getAnnualSalary () {return salary*12;}

    //Cálculo del nuevo salario en función al porcentaje de subida
    public int raiseSalary (int percent) {return this.salary = salary+(salary*percent)/100;}

    public String toString () {return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";}
}