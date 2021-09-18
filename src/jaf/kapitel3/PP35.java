//*************************************************************************************
//  kapitel3.PP35.java           Author:Devin/Hasler
//  Calculate the distance between two points
//*************************************************************************************



package jaf.kapitel3;
import java.util.Scanner;

public class PP35 {
    public static void main(String[] args){
      double distance;
      double distanceWithoutSqrt;


      Scanner scan = new Scanner(System.in);

      System.out.println("Give me the x coordinate of Point one");      //scan all coordinates
      double x1 = scan.nextInt();

      System.out.println("Give me the y coordinate of Point one");
      double y1 = scan.nextInt();

      System.out.println("Give me the x coordinate of Point two");
      double x2 = scan.nextInt();

      System.out.println("Give me the y coordinate of Point two");
      double y2 = scan.nextInt();

      distanceWithoutSqrt = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);      //calculate distance without the root
      distance = Math.sqrt(distanceWithoutSqrt);                        //take the root
      System.out.println("The distance between the two points is: " + distance);






      }
    }


