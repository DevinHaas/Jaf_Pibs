//*************************************************************************************
//  kapitel3.PP32.java           Author:Devin/Hasler
//  Calculate the Volume of two cubes
//*************************************************************************************


package jaf.kapitel4.pp41.src.jaf.kapitel3;
import java.util.Scanner;

public class PP32 {
  public static void main(String[] args){
    double sideA;
    double sideB;


    Scanner myScanner = new Scanner(System.in);

    System.out.println("Give me the side of cube A in centimeter: ");
    sideA= myScanner.nextInt();

    System.out.println("Give me the side of cube B in centimeter: ");
    sideB = myScanner.nextInt();

    double volumeB;
    double volumeA;
    volumeA = Math.pow(sideA, 3);
    volumeB = Math.pow(sideB, 3);
    double sum;
    sum = volumeA + volumeB;
    System.out.println("The sum of both cubes is: " + sum + " cubic centimeter");






  }
}
