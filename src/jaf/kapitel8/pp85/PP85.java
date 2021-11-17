package jaf.kapitel8.pp85;

public class PP85 {
  public static void main(String[] args) {
    NumberList list = new NumberList(1, 2, 3, 4);
    list.calcMean();
    list.calSd();

    System.out.println(list);
  }
}
