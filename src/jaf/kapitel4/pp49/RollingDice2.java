package jaf.kapitel4.pp49;

public class RollingDice2 {
  public static void main(String[] args){

    PairofDice pair = new PairofDice();

    pair.roll();
    System.out.println(pair.sum());
    pair.roll();
    System.out.println(pair.sum());
    System.out.println(pair.getFaceValue1());
    System.out.println(pair.getFaceValue2());




  }

}
