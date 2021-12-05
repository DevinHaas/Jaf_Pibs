package jaf.kapitel9.pp92;

public class Administrator extends Employee {
  public Administrator(String name, String lastName, int age) {
    super(name, lastName, age, "Administrator");
  }

  public String firePeople(){
    return "We have a big administrative Problem, to much employees which means we have to fire people. \n";
  }

  public String toString() {
    return "The Administrator does all the administrative tasks \n";
  }
}
