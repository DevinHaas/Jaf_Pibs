package jaf.kapitel13.pp133;

import java.util.Random;

public class SelectionSortDriver {

  static final int MAX_NUMBERS = 25;
  static final int MAX_INT_VALUE = 100;

  public static void main(String[] args) {
    Random gen = new Random();

    SelectionSort sort = new SelectionSort();
    int numInts = gen.nextInt(MAX_NUMBERS) + 1;

    System.out.println("Generated " + numInts + " integers: ");

    for (int i = 0; i < numInts; i++) {
      sort.add(gen.nextInt(MAX_INT_VALUE));
    }

    System.out.println(sort); // unsorted

    sort.sort();

    System.out.println("Sorted: ");
    System.out.println(sort);
  }
}
