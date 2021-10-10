package jaf.kapitel5.ex514;

import java.util.Scanner;

public class divisibleTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the first integer: ");
        int number1 = scan.nextInt();

        System.out.println("Type in the second integer: ");
        int number2 = scan.nextInt();

        evenlyDivisible divisible1 = new evenlyDivisible(number1, number2);

        System.out.println("The divisibility of this tuple is: "+ divisible1.isDivisible());

    }
}
