package jaf.kapitel7.pp75;

public class TaskTest {
  public static void main(String[] args){

    //set a task
    Task task1 = new Task("Cleaning", "Clean the whole kitchen");

    System.out.println(task1);

    //set the priority
    task1.setPriority(10);

    //print the task after changing the priority
    System.out.println(task1);
    System.out.println(task1.getPriority());

  }

}
