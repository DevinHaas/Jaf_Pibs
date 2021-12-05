package jaf.kapitel9.pp95;

public class Person {

  int age;
  String nationality;
  String occupation;
  int income;

  public Person(int age, String nationality, String occupation, int income) {
    this.age = age;
    this.nationality = nationality;
    this.occupation = occupation;
    this.income = income;
  }

  public int getAge() {
    return this.age;
  }

  public String getNationality() {
    return this.nationality;
  }

  public String getOccupation() {
    return this.occupation;
  }

  public int getIncome() {
    return this.income;
  }
}
