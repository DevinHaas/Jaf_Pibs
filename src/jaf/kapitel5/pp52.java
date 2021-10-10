package jaf.kapitel5;

import java.util.Scanner;

public class pp52 {
    public static void main(String[] args){
        int year;

        //creat a scanner object
        Scanner scan = new Scanner(System.in);

        //read a year of a user
        System.out.println("Give me a year (0 to quit): ");
        year = scan.nextInt();

        while (year != 0){

            int division1 = year/4;
            int division2 = year/100;
            int division3 = year/400;

            //the year has to be in the gregorian calendar
            if (year < 1582){
                System.out.println("Sorry the year has to be greater then 1582 because of the Gregorian Calender");
            }

            //check all the conditions needed to be a leap year
            if (division1 * 4 == year && year >= 1582)
            {
                if (division2 * 100 == year)
                {
                    if (division3*400 == year)
                    {
                        System.out.println("The year "+ year+ " is a leap year"+"\n");
                    }
                    else
                        System.out.println("The year "+ year+ " is not a leap year"+"\n");
                }
                else
                    System.out.println("The year "+ year+ " is a leap year"+"\n");

            }
            else
                System.out.println("The year "+ year+ " is not a leap year"+"\n");


            //you can type in years  until you type in 0
            System.out.println("Give me a year (0 to quit): ");
            year = scan.nextInt();


        }

    }
}
