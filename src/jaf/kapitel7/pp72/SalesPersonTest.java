package jaf.kapitel7.pp72;

public class SalesPersonTest {
  public static void main(String[] args) {

    //creat two sales persons
    SalesPerson person1 = new SalesPerson("Thomas", 799010360, "Bern");
    SalesPerson person2 = new SalesPerson("Alfie Solomons", 684858584, "Birmingham");

    //set the daily amount
    person1.setDailyAmount(3, 100);
    person2.setDailyAmount(0, 4);

    person1.getDailyAmount(3);

    System.out.println(person1);
    System.out.println(person2);

    //print the total and average sales amount
    System.out.println(person1.average());
    System.out.println(person1.total());

    //show that at the beginning every amount is 0
    person1 = new SalesPerson();
    System.out.println(person1);
  }
}
