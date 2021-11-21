package jaf.kapitel8.pp83;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PP83 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Integer> numbers = new ArrayList<>();

    Scanner scan = new Scanner(new File("src/jaf/kapitel8/pp83/Numbers83.txt"));
    String numberScan;
    while (scan.hasNext()) {
      numberScan = scan.nextLine();
      int number = Integer.parseInt(String.valueOf(numberScan));
      numbers.add(number);
    }
    scan.close();

    int min = 1;
    int max = 10;
    for (int j = 1; j <= 10; j++) {
      System.out.print(min + " - ");
      System.out.printf("%-5d", max);
      System.out.print(" | \t");
      for (Integer number : numbers) {
        if ((number >= min) && (number <= max)) {
          System.out.print("*");
        }
      }
      System.out.println();
      min += 10;
      max += 10;
    }
  }
}
