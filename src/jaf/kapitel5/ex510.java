package jaf.kapitel5;

import java.util.Scanner;

public class ex510 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);              //creat a new scanner

        System.out.println("Type in a number please: ");                //ask for a number
        int number = scan.nextInt();

        while (number < 0){                             //while the number is negative it will not leave this loop
            System.out.println("This number is not valid (not positive) , try it again: ");
            number = scan.nextInt();
        }
        //if the number is positive the loop is skipped or left
        System.out.println("Congratulations, this number is positive");
        System.out.println("Your number was: " + number);





    }
}
