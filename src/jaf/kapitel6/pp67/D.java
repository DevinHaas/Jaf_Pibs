package jaf.kapitel6.pp67;

public class D {
  public static void main(String[] args) {
    final int COLUMNS = 5;
    final int NUMBER = 9;

    for (int num = 1; num <= COLUMNS; num++) {
      for (int i = 1; i <= (COLUMNS - num); i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= ((num * 2) - 1); i++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int num = 0; num < COLUMNS; num++) {
      for (int i = 1; i <= (num); i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= (NUMBER - num * 2); i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
