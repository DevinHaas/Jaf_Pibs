package jaf.kapitel9.pp95;

public class SetOfPeople {

  public final Person[] people;

  public SetOfPeople() {
    people = new Person[5];

    people[0] = new Person(20, "Swiss", "Computer Sience", 10000);
    people[1] = new Person(35, "Spain", "Banker", 30000);
    people[2] = new Person(53, "Russian", "Drogues Dealer", 110000);
    people[3] = new Person(42, "Swiss", "Farmer", 100000);
    people[4] = new Person(24, "Italian", "Bartender", 75000);
  }
}
