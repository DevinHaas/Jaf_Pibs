package jaf.kapitel7.pp74;

public class RationalNumberTest {
  public static void main(String[] args){

    RationalNumber rat1 = new RationalNumber(2, 3);

    System.out.println(rat1.getNumerator());
    System.out.println(rat1.getDenominator());

    rat1.comparable(new RationalNumber(4,6));




  }
}
