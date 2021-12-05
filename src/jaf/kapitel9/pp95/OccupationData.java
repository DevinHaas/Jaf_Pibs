package jaf.kapitel9.pp95;

import java.util.Arrays;

public class OccupationData extends SetOfPeople {
  String[] dataOccupation;

  public OccupationData() {
    dataOccupation = new String[people.length];
    for (int i = 0; i < people.length; i++) {
      dataOccupation[i] = people[i].getOccupation();
    }
  }

  public String toStringOccupationData() {
    return "The following Occupation Data was collected: " + Arrays.toString(dataOccupation);
  }
}
