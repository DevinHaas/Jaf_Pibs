package jaf.kapitel6.abgabe;

import java.util.Scanner;

public class PP69 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Sir/Miss if you please I would try to detect lowercase vowel ");
    String text = scan.nextLine();

    //creat counters for every vowel
    int aCounter = 0;
    int eCounter = 0;
    int iCounter = 0;
    int oCounter = 0;
    int uCounter = 0;
    int nonwovelCounter = 0;

    //make a for loop that goes threw the whole string
    for(int i = 0; i < text.length(); i++){
      //sonarlint automatically makes an enhanced switch statement
      switch (text.charAt(i)) {
        case ('a') -> aCounter++;
        case ('e') -> eCounter++;
        case ('i') -> iCounter++;
        case ('o') -> oCounter++;
        case ('u') -> uCounter++;
        default -> nonwovelCounter++;
      }
    }
    //print every information needed
    System.out.println("a: "+ aCounter);
    System.out.println("e: "+ eCounter);
    System.out.println("i: "+ iCounter);
    System.out.println("o: "+ oCounter);
    System.out.println("u: "+ uCounter);
    System.out.println("That means the amount of lowercase vowels is: "+
        (aCounter+eCounter+iCounter+oCounter+uCounter));
    System.out.println("The number of nonvowel characters are "+ nonwovelCounter);
  }

}
