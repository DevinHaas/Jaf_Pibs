package jaf.kapitel13.pp133;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
  LinkedList<Integer> list;
  Random ran = new Random();


  public ListGenerator(){
    int length = ran.nextInt(49) +1;
    list = new LinkedList<>();

    for (int i = 0; i <= length; i++){
      int number = ran.nextInt(29) + 1;
      list.add(number);
    }
  }

  public List<Integer> getList() {
    return list;
  }
}
