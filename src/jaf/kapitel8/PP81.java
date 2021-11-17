package jaf.kapitel8;

import java.util.Scanner;

public class PP81 {

  public static void main(String[] args){

    //creat an array from 0-50
    int[] numbers = new int[51];
    Scanner scan = new Scanner(System.in);

    int number = 1;

    //creat a loop for entering numbers if in range 0-50
    while(number >= 0 && number <= 50){
      numbers[number] += 1;
      System.out.println("Give me a integer between 0 and 50 (outside of range to quit)");
      number = scan.nextInt();
    }
    //subtracting the occurrence of the number that was used to enter the loop by one
    numbers[1] -= 1;
    //print all the numbers and their occurrences
    for (int i = 0; i < numbers.length; i++){
      System.out.println("Number: " + i + " \t Occurrence: " + numbers[i] +"\n");
    }


  }


}
