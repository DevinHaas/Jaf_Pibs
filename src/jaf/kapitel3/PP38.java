//*************************************************************************************
//  kapitel3.PP38.java           Author:Devin/Hasler
//  Calculate the sine, cosine and tangent of a random number
//*************************************************************************************

package jaf.kapitel3;
import java.util.Random;

public class PP38 {
  public static void main(String[] args){
    Random generator = new Random();                           //creat a random number generator
    double number = generator.nextInt(21) + 20;         //generate a random number between 20 and 40
    System.out.println(number);
    double sin = Math.sin(number);                             //calculate the sin, cos and tan with Math class
    double cos = Math.cos(number);
    double tan = Math.tan(number);

    System.out.println("The sine is: " + sin + " cos is: "+ cos +" tangent is: "+ tan);

  }

}
