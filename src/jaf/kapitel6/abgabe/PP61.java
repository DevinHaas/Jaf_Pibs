package jaf.kapitel6.abgabe;

import java.util.Scanner;

public class PP61 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Give me an Integer: ");
    int value = scan.nextInt();

    // creat a loop for making sure that value is not less than 2
    while (value < 2) {
      System.out.println("The value has to be grater or equal to 2");
      System.out.println("Give me an Integer: ");
      value = scan.nextInt();
    }

    // creat a for loop to add every even integer between 2 and your value
    int sum = 0;
    for (int i = 2; i < value; i += 2) {
      sum = sum + i;
    }
    // add the value add the end because it is requested
    System.out.println(
        "The sum of all even integers between 2 and " + value + " is: " + (sum + value));
  }
}
