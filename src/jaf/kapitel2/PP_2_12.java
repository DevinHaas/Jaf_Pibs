package jaf.kapitel2;
import java.util.Scanner;

public class PP_2_12 {
  public static void main(String[] args){
    int length, area, perimeter;
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a length of your square: ");
    length = scan.nextInt();

    area = length*length;
    perimeter = length * 4;

    System.out.println("The area equals: " + area + " m**2 and the perimeter equals: " + perimeter + "m");

  }
}
