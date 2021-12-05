package jaf.kapitel9.pp91;

import java.util.Random;

public class Coin91 {

  private static final int TAILS = 1;
  private int face;
  Random ran = new Random();

  public Coin91() {
    flip();
  }
  // creat a method that flips the coins (generates a number between 0 and 1)
  public void flip() {
    face = ran.nextInt() * 2;
  }
  // creat two methods to check if it is Head or Tail

  public String toString() {
    if (face == TAILS) return "Tail";
    else return "Head";
  }
}
