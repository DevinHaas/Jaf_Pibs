package jaf.kapitel9.pp95;

import java.util.Arrays;

public class IncomeData extends SetOfPeople {
  int[] dataIncome;

  public IncomeData() {
    dataIncome = new int[people.length];
    for (int i = 0; i < people.length; i++) {
      dataIncome[i] = people[i].getIncome();
    }
  }

  public String toStringIncomeData() {
    return "The following Income Data was collected: " + Arrays.toString(dataIncome);
  }
}
