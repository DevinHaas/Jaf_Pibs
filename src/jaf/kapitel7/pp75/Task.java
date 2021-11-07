package jaf.kapitel7.pp75;

import jaf.kapitel7.pp76.Complexity;

public class Task implements Priority, Complexity {
  int priority;
  int complexity;
  String taskName;
  String info;

  // creat a task name and infos about the task and set the priority to 0
  public Task(String taskName, String info) {
    this.taskName = taskName;
    this.info = info;
    this.priority = 0;
    this.complexity = 0;
  }

  // use methods from interface priority to set the priority and get the priority
  @Override
  public void setPriority(int priority) {
    this.priority = priority;
  }

  @Override
  public int getPriority() {
    return priority;
  }

  public String getTaskName() {
    return taskName;
  }

  // creat a toString for infos about the task
  @Override
  public String toString() {
    return "This task has the name: "
        + taskName
        + ".\n Infos about the Task: "
        + info
        + ".\n And the priority: "
        + priority
        + ".\n And the complexity: "
        + complexity
        + "\n";
  }

  // methods from interface Complexity
  @Override
  public void setComplexity(int complexity) {
    this.complexity = complexity;
  }

  @Override
  public int getComplexity() {
    return complexity;
  }
}
