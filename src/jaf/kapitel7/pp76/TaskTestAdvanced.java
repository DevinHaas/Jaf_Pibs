package jaf.kapitel7.pp76;

import jaf.kapitel7.pp75.Task;

public class TaskTestAdvanced {
  public static void main(String[] args){

    //creat a new task
    Task task1 = new Task("Cleaning", "Clean the whole kitchen");

    System.out.println(task1);

    //add priority and the complexity of the task
    task1.setPriority(10);
    task1.setComplexity(100);

    System.out.println(task1);
    System.out.println(task1.getPriority());
    System.out.println(task1.getComplexity());

  }

}
