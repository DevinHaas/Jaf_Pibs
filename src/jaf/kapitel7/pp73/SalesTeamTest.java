package jaf.kapitel7.pp73;

import jaf.kapitel7.pp72.SalesPerson;

public class SalesTeamTest {
  public static void main(String[] args) {

    SalesTeam team1 = new SalesTeam("Peaky Blinders");
    SalesTeam team2 = new SalesTeam("The Conservatives");

    SalesPerson person1 = new SalesPerson("Thomas Shelby", 799010360, "Birmingham");
    SalesPerson person2 = new SalesPerson("John Shelby", 684858584, "Birmingham");

    SalesPerson person3 = new SalesPerson("Jimmy McCavern", 949494949, "Glasgow");
    SalesPerson person4 = new SalesPerson("Oswald Mosley", 444444444, "London");

    person1.setDailyAmount(0, 100);
    person2.setDailyAmount(1, 100);

    person3.setDailyAmount(3, 50);
    person4.setDailyAmount(4, 50);

    team1.addSalesPerson(person1);
    team1.addSalesPerson(person2);

    team2.addSalesPerson(person3);
    team2.addSalesPerson(person4);

    //show the weekly reports for both teams
    team1.weeklyReport();
    team2.weeklyReport();
  }
}
