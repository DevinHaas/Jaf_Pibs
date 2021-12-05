package jaf.kapitel9.pp91;

public class TestMonetaryCoins {

  public static void main(String[] args) {

    MonetaryCoin coin1 = new MonetaryCoin(10);
    MonetaryCoin coin2 = new MonetaryCoin(20);
    MonetaryCoin coin3 = new MonetaryCoin(30);

    System.out.println(
        "Sum of coins is: " + (coin1.getValue() + coin2.getValue() + coin3.getValue()) + " CHF.-");

    System.out.println(coin1);
    coin1.flip();
    System.out.println(coin2);
  }
}
