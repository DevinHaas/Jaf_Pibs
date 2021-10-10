package jaf.kapitel5;

import java.util.Scanner;

public class pp51 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);              //creat a scanner object

        System.out.println("Give me a year: ");             //read a year of a user
        int year = scan.nextInt();

        int division1 = year/4;
        int division2 = year/100;
        int division3 = year/400;

        if (year < 1582){
            System.out.println("Sorry the year has to be greater then 1582 because of the Gregorian Calender");
        }

        if (division1 * 4 == year )                     //check all the conditions needed to be a leap year
        {
            if (division2 * 100 == year)
            {
                if (division3*400 == year)
                {
                    System.out.println("The year "+ year+ " is a leap year");
                }
                else
                    System.out.println("This year is no leap year");
            }
            else
                System.out.println("The year "+ year+ " is a leap year");

        }
        else
            System.out.println("This year is not a leap year");

    }
}
