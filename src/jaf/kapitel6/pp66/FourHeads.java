package jaf.kapitel6.pp66;

import jaf.kapitel5.pp56.Coin;

public class FourHeads {
  public static void main(String[] args) {

    // creat a new coin
    Coin coin = new Coin();

    // creat integers to count the
    int headCounter = 0;
    int flipCounter = 0;

    do {
      coin.flip();
      System.out.println(coin);
      flipCounter++;
      if (coin.isHead()) {
        headCounter++;
      } else headCounter = 0;
    } while (headCounter < 5);

    System.out.println(flipCounter);
  }
}
