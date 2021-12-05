package jaf.kapitel9.pp91;

import jaf.kapitel9.pp91.Coin91;

public class MonetaryCoin extends Coin91 {

  int value;

  public MonetaryCoin(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
