package jaf.kapitel9.pp92;

public class Receptionist extends Employee{

  public Receptionist (String name, String lastName, int age){
    super(name, lastName, age, "Receptionist");
  }

  public String welcome(){
    return "Hello, and welcome to our hospital \n";
  }

  public String toString(){
    return " The Receptionist task is to help the people find their chambers or help them \n";
  }
}
