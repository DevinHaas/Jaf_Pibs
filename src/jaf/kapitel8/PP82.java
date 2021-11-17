package jaf.kapitel8;

import java.util.Scanner;

public class PP82 {
  public static void main(String[] args){

    //creat an array from 0-50
    int[] numbers = new int[51];
    Scanner scan = new Scanner(System.in);

    int number = 1;

    //creat a loop for entering numbers if in range -25 - +25
    while(number >= -25 && number <= 25){
      //add to the number 25 so that it fits into the array
      numbers[number + 25] += 1;
      System.out.println("Give me a integer between -25 and 50 (outside of range to quit)");
      number = scan.nextInt();
    }
    //subtracting the occurrence of the number that was used to enter the loop by one
    numbers[26] -= 1;
    //print all the numbers and their occurrences
    for (int i = -25; i <= 25; i++){
      System.out.println("Number: " + i + " \t Occurrence: " + numbers[i + 25] +"\n");
    }


  }
}
