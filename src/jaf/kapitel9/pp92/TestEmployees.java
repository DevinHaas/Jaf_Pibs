package jaf.kapitel9.pp92;

public class TestEmployees {
  public static void main(String[] args){

    Janitor janitor1 = new Janitor("Jakob", "Blaser", 30);
    Doctor doctor1 = new Doctor("Fritz", "Hans", 45);
    Surgeon surgeon1 = new Surgeon("Kathrina", "von Allmen", 50);
    Nurse nurse1 = new Nurse("Isabelle", "Hunzicker", 19);
    Administrator administrator1 = new Administrator("Andreas", "Lüthi", 60);

    System.out.println(janitor1);
    System.out.println(janitor1.clean());

    System.out.println(surgeon1);
    System.out.println(surgeon1.surgery());

    System.out.println(nurse1);
    System.out.println(nurse1.help());

    System.out.println(administrator1);
    System.out.println(administrator1.firePeople());

    System.out.println(doctor1);
    doctor1.examine();



  }
}
