package jaf.kapitel7.pp73;

import jaf.kapitel7.pp72.SalesPerson;
import java.util.ArrayList;

public class SalesTeam {
  String teamName;
  //creat an array list for the teams
  ArrayList<SalesPerson> team = new ArrayList<>();

  //creat a driver class with the team name
  public SalesTeam(String teamName) {
    this.teamName = teamName;
  }

  //creat a method to add Salespersons
  public void addSalesPerson(SalesPerson person) {
    team.add(person);
  }

  //method for weekly report with name and their sales amount and the total team sales amount
  public void weeklyReport() {
    int total = 0;
    for (SalesPerson person : team) {
      System.out.println(person.getName());
      System.out.println(person.total() + "\n");
      total += person.total();
    }
    System.out.println("The total Sale amount of team " + teamName + " is: " + total + "\n" + "\n");
  }
}
