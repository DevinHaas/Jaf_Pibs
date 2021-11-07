package jaf.kapitel4.pp49;

public class PairofDice {

  private static final int MAX = 6;
  private int faceValue1;
  private int faceValue2;

  public PairofDice() {
    faceValue1 = 0;
    faceValue2 = 0;
  }

  public void roll() {
    roll1();
    roll2();
  }

  public void roll1() {
    faceValue1 = (int) (Math.random() * MAX) + 1;
  }

  public void roll2() {
    faceValue2 = (int) (Math.random() * MAX) + 1;
  }

  public void setFaceValue1(int value) {
    faceValue1 = value;
  }

  public int getFaceValue1() {
    return faceValue1;
  }

  public void setFaceValue2(int value) {
    faceValue2 = value;
  }

  public int getFaceValue2() {
    return faceValue2;
  }

  public int sum() {
    return faceValue1 + faceValue2;
  }
}
