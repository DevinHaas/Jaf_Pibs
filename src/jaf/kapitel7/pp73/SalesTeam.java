package jaf.kapitel7.pp73;

import jaf.kapitel7.pp72.SalesPerson;
import java.util.ArrayList;

public class SalesTeam {
  String teamName;
  ArrayList<SalesPerson> team = new ArrayList<>();

  public SalesTeam(String teamName) {
    this.teamName = teamName;
  }

  public void addSalesPerson(SalesPerson person) {
    team.add(person);
  }

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
