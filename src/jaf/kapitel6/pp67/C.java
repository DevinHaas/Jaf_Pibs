package jaf.kapitel6.pp67;

public class C {
  public static void main(String[] args) {
    final int COLUMNS = 10;

    for (int num = 1; num <= COLUMNS; num++) {

      for (int i = 0; i < (num - 1); i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= ((COLUMNS - num) + 1); i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
