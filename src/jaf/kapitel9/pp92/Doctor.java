package jaf.kapitel9.pp92;

public class Doctor extends Employee {

  public Doctor (String name, String lastName, int age){
    super(name, lastName, age, "Doktor");
  }

  public String examine(){
    return " I'm examining a patient right know \n";
  }

  public String toString(){
    return "A doctors job is to find medical problem or deficits \n";
  }
}