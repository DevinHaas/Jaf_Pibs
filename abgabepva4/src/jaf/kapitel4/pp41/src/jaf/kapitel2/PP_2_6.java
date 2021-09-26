package jaf.kapitel4.pp41.src.jaf.kapitel2;
import java.util.Scanner;

public class PP_2_6 {
  public static void main(String[] args){
    float miles;
    float BASE;
    BASE = (float) 1.60935;
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me an distance in miles: ");
    miles = myScanner.nextFloat();
    System.out.println("This equals "+ miles * BASE + " kilometers" );


  }
}
