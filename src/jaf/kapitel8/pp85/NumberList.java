package jaf.kapitel8.pp85;

import java.util.Arrays;

public class NumberList {
  float numberLength;
  float mean;
  float sum = 0;
  double sdVariable = 0;
  float sd;

  public NumberList(int... number){
    if (number.length > 50){
      System.out.println("Please only 50 numbers are allowed");
    }
    for (int j : number) {
      sum += j;
      numberLength = number.length;
    }
    mean = sum/(numberLength);
    System.out.println(Arrays.toString(number));
    for (int j : number) {
      sdVariable = sdVariable + Math.pow((j - mean), 2);
    }

  }

  public void calcMean(){
    mean = sum/(numberLength);
  }

  public void calSd(){
    sd = (float) Math.sqrt(sdVariable/(numberLength));
  }

  @Override
  public String toString() {
    return "NumberList{ " +
        ", mean = " + mean +
        ", sd = " + sd +
        '}';
  }
}
