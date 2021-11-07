package jaf.kapitel6;

import java.util.Scanner;

public class PP62 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // ask for a text from the user
    System.out.println("Sir/Miss, I would appreciate if you would type in a sentence or a word: ");
    String string = scan.nextLine();

    // use a for loop to print every char in the string on a new line
    for (int i = 0; i < string.length(); i++) {
      System.out.println(string.charAt(i));
    }
  }
}
