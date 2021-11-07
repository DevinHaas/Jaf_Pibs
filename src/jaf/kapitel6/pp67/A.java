package jaf.kapitel6.pp67;

public class A {
  public static void main(String[] args){
    final int  MAX_ROWS = 10;

    for(int row= MAX_ROWS; row >= 0; row--){
      for (int star = row; star > 0; star-- ){
        System.out.print("*");
      }
      System.out.println();


    }


  }

}
