package jaf.kapitel9.pp95;

import java.util.Arrays;

public class AgeData extends SetOfPeople {

  int[] dataAge;

  public AgeData() {
    dataAge = new int[people.length];
    for (int i = 0; i < people.length; i++) {
      dataAge[i] = people[i].getAge();
    }
  }

  public String toStringAgeData() {
    return "The following Age Data was collected: " + Arrays.toString(dataAge);
  }
}
