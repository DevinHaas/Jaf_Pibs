package jaf.kapitel9.pp92;

public class Janitor extends Employee {
  public Janitor (String name, String lastName, int age){
    super(name, lastName, age, "Janitor");
  }


  public String clean(){
    return "I'm cleaning rightnow \n";
  }


  public String toString(){
    return "The Janitors task is to clean the hospital and that I'm doing \n";
  }

}
