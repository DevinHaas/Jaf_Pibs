package jaf.kapitel5;

import java.util.Scanner;

public class ex52 {

    public static void main(String[] args){

        int age;

        Scanner scan = new Scanner(System.in);                  //creat a scanner
        System.out.println("What is your age sir or Milady?:  ");
        age = scan.nextInt();

        if (age< 18)                    //The curly Brackets where missing in the book
        {
            System.out.println("My sincerest apologies, you are to young");
            System.out.println("But don't give up you can try when you are older");
        }
        else                        //here the Brackets are not needed because it is only one statement
            System.out.println("Congratulations Sir/Milady, you now officially die sooner then the other group");

    }
}
