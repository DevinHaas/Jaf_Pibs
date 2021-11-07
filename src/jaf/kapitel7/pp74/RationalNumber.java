package jaf.kapitel7.pp74;

public class RationalNumber implements Comparable {
  private int numerator;
  private int denominator;

  public RationalNumber(int numer, int denom) {
    if (denom == 0) denom = 1;

    if (denom < 0) {
      numer = numer * -1;
      denom = denom * -1;
    }

    numerator = numer;
    denominator = denom;

    reduce();
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public void comparable(RationalNumber rat2) {
    double tolerance = 0.0001;
    int numerator2 = rat2.getNumerator();
    int denominator2 = rat2.getDenominator();

    float number2 = (float) numerator2 / (float) denominator2;
    float number1 = (float) numerator / (float) denominator;

    if (Math.abs(number1 - number2) < tolerance) {
      System.out.println("They are equal");
    }else{
      System.out.println("They are not equal !!");
    }
  }

  private void reduce() {
    if (numerator != 0) {
      int common = gcd(Math.abs(numerator), denominator);

      numerator = numerator / common;
      denominator = denominator / common;
    }
  }

  private int gcd(int num1, int num2) {
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }
}
