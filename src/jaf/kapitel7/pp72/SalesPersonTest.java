package jaf.kapitel7.pp72;

public class SalesPersonTest {
  public static void main(String[] args) {

    SalesPerson person1 = new SalesPerson("Thomas", 799010360, "Bern");
    SalesPerson person2 = new SalesPerson("Alfie Solomons", 684858584, "Birmingham");

    person1.setDailyAmount(3, 100);
    person2.setDailyAmount(0, 4);

    person1.getDailyAmount(3);

    System.out.println(person1);
    System.out.println(person2);

    System.out.println(person1.average());
    System.out.println(person1.total());

    person1 = new SalesPerson();
    System.out.println(person1);
  }
}
