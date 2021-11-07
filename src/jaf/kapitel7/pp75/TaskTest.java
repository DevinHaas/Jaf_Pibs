package jaf.kapitel7.pp75;

public class TaskTest {
  public static void main(String[] args){

    Task task1 = new Task("Cleaning", "Clean the whole kitchen");

    System.out.println(task1);

    task1.setPriority(10);

    System.out.println(task1);
    System.out.println(task1.getPriority());

  }

}
