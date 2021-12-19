package jaf.kapitel13.pp133;

import java.util.List;

public class SelectionSort2 {

  public void sorting(List<Integer> list) {
    int min;
    int temp;

    for (int index = 0; index < list.size(); index++) {
      min = index;

      for (int scan = index + 1; scan < list.size(); scan++) {
        if (list.get(scan) < list.get(min)) {
          min = scan;
        }
      }

      // the SonarLint Issue can be ignored because the value is added directly afterwards
      // that means the list doesn't actually shrink, well only temporarily
      temp = list.remove(min);
      list.add(index, temp);
    }
  }
}
