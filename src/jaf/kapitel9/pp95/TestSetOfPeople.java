package jaf.kapitel9.pp95;

public class TestSetOfPeople {

  public static void main(String[] args) {

    AgeData ageData = new AgeData();
    NationalityData nationalityData = new NationalityData();
    IncomeData incomeData = new IncomeData();
    OccupationData occupationData = new OccupationData();

    System.out.println(ageData.toStringAgeData());
    System.out.println(nationalityData.toStringNationalityData());
    System.out.println(incomeData.toStringIncomeData());
    System.out.println(occupationData.toStringOccupationData());
  }
}
