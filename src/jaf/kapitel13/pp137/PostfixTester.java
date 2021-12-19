package jaf.kapitel13.pp137;

public class PostfixTester {
  public static void main(String[] args) {

    PostfixExpression expression1 = new PostfixExpression("2 3 * 5 4 * + 9 -"); // equals "17"
    PostfixExpression expression2 = new PostfixExpression("4 5 7 2 + - *"); // equals "-16"
    PostfixExpression expression3 = new PostfixExpression("3 4 + 2 * 7 /"); // equals 2
    PostfixExpression expression4 = new PostfixExpression("6 5 4 3 + * %"); // equals 5

    expression1.printArrayList();
    expression1.calculate();
    expression1.printStack();

    expression2.printArrayList();
    expression2.calculate();
    expression2.printStack();

    expression3.printArrayList();
    expression3.calculate();
    expression3.printStack();

    expression4.printArrayList();
    expression4.calculate();
    expression4.printStack();
  }
}
