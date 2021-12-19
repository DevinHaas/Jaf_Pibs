package jaf.kapitel13.pp137;

//Info: Ich wusste nicht wie ich ein Operator als Parameter einer Methode mitgeben kann
//deshalb musste ich für jede Operatation eine eigene Methode schreiben


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PostfixExpression {

  ArrayList<String> postExprArrayList = new ArrayList<>();
  StringTokenizer stringTokenizer;
  String postfixExpressionSentence;
  Deque<String> stack = new LinkedList<>();

  public PostfixExpression(String postfixExpression) {
    this.postfixExpressionSentence = postfixExpression;
    createQueue();
  }

  public void createQueue() {
    stringTokenizer = new StringTokenizer(postfixExpressionSentence);
    while (stringTokenizer.hasMoreTokens()) {
      postExprArrayList.add(stringTokenizer.nextToken());
    }
  }

  public void printStack() {
    System.out.println(stack);
  }

  public void printArrayList(){
    System.out.println("array list");
    System.out.println(postExprArrayList);
  }

  public void calculate() {
    for (String element : postExprArrayList) {
      switch (element) {
        case "+" -> addition();
        case "-" -> subtraction();
        case "*" -> multiplication();
        case "/" -> division();
        case "%" -> modulo();
        default -> stack.addLast(element);
      }
    }
  }

  public void addition() {
    if (!stack.isEmpty()){
      int zahl2 = Integer.parseInt(stack.removeLast());
      if(!stack.isEmpty()){
        int zahl1 = Integer.parseInt(stack.removeLast());
        int result = zahl1 + zahl2;
        stack.addLast(String.valueOf(result));
      }
    }
  }

  public void subtraction() {
    if (!stack.isEmpty()){
      int zahl2 = Integer.parseInt(stack.removeLast());
      if(!stack.isEmpty()){
        int zahl1 = Integer.parseInt(stack.removeLast());
        int result = zahl1 - zahl2;
        stack.addLast(String.valueOf(result));
      }
    }
  }

  public void multiplication() {
    if (!stack.isEmpty()){
      int zahl2 = Integer.parseInt(stack.removeLast());
      if(!stack.isEmpty()){
        int zahl1 = Integer.parseInt(stack.removeLast());
        int result = zahl1 * zahl2;
        stack.addLast(String.valueOf(result));
      }
    }
  }

  public void division() {
    if (!stack.isEmpty()){
      int zahl2 = Integer.parseInt(stack.removeLast());
      if(!stack.isEmpty()){
        int zahl1 = Integer.parseInt(stack.removeLast());
        int result = zahl1 / zahl2;
        stack.addLast(String.valueOf(result));
      }
    }
  }
  public void modulo() {
    if (!stack.isEmpty()){
      int zahl2 = Integer.parseInt(stack.removeLast());
      if(!stack.isEmpty()){
        int zahl1 = Integer.parseInt(stack.removeLast());
        int result = zahl2 % zahl1;
        stack.addLast(String.valueOf(result));
      }
    }
  }
}
