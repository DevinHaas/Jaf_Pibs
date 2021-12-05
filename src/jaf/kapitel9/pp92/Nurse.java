package jaf.kapitel9.pp92;

public class Nurse extends Employee{

  public Nurse (String name, String lastName, int age){
    super(name, lastName, age, "Nurse");
  }


  public String help(){
    return "Are you hungry ? \nCan I bring you something or are you comfortable ? \n";
  }

  public String toString(){
    return "A nurse helps the patients and watches over them \n";
  }
}
