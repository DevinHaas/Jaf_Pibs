package jaf.kapitel9.pp95;

import java.util.Arrays;

public class NationalityData extends SetOfPeople {
  String[] dataNationality;

  public NationalityData() {

    dataNationality = new String[people.length];
    for (int i = 0; i < people.length; i++) {
      dataNationality[i] = people[i].getNationality();
    }
  }

  public String toStringNationalityData() {
    return "The following Nationality Data was collected: " + Arrays.toString(dataNationality);
  }
}
