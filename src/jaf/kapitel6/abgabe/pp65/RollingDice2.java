package jaf.kapitel6.abgabe.pp65;

import jaf.kapitel4.pp49.PairofDice;

public class RollingDice2 {
  public static void main(String[] args) {

    PairofDice pair = new PairofDice();

    // get the face value at the beginning
    System.out.println(pair.getFaceValue1());
    System.out.println(pair.getFaceValue2());

    // creat a loop that rolls the dice 1000 times and prints the face values
    int boxCarsCounter = 0;
    for (int i = 0; i <= 1000; i++) {
      pair.roll();
      System.out.println(pair.getFaceValue1());
      System.out.println(pair.getFaceValue2());
      System.out.println();
      // if both dice are a 6 the box cars counter is incremented
      if (pair.sum() == 12) {
        boxCarsCounter++;
      }
    }
    // print the amount of box cars
    System.out.println(boxCarsCounter);
    pair.setFaceValue2(0);
    pair.setFaceValue1(0);
  }
}
