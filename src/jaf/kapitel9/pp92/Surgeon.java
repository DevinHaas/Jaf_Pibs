package jaf.kapitel9.pp92;

public class Surgeon extends Employee{

  public Surgeon (String name, String lastName, int age){
    super(name, lastName, age, "Surgeon");
  }

  public String surgery(){
    return "I'm doing a surgery \n";
  }

  public String toString(){
    return "Its just a quick fix. I only need open the heart and tak out two liters of blood \n";
  }


}
