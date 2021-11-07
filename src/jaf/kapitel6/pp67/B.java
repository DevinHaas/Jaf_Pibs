package jaf.kapitel6.pp67;

public class B {
  public static void main(String[] args) {
    final int COLUMNS = 10;

    for (int num = 1; num <= COLUMNS; num++) {
      for (int i = 1; i <= (COLUMNS - num); i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= num; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
