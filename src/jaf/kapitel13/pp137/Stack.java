package jaf.kapitel13.pp137;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
  static Queue<Object> queue = new LinkedList<>();

  static int currentSize;
  Stack(){
  }

  static void push(Object x){
    currentSize++;

    queue.add(x);

  }

  static void pop(){

    if (queue.isEmpty()){
      return;
    }

    queue.remove();
    currentSize--;
  }


  static Object top(){

    if (queue.isEmpty()){
      return -1;

    }
    return queue.peek();
  }

  static int size(){
    return currentSize;
  }
}
