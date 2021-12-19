package jaf.kapitel12.pp122;

import jaf.kapitel13.pp135.Car;

public class TestBag {

  public static void main(String[] args) {
    Bag bag1 = new Bag();
    bag1.addItem(1);
    bag1.addItem(2);
    bag1.addItem(3);

    System.out.println(bag1);
    System.out.println(bag1.size());

    Bag bag2 = new Bag();
    bag2.addItem(new Car("Vw", "Golf", 100, "Green"));
    bag2.addItem(new Car("Ferrari", "488", 565, "Red"));
    bag2.addItem(new Car("Ferrari", "LaFerrari", 780, "White"));
    bag2.addItem(new Car("Seat", "Leon", 100, "Black"));
    System.out.println(bag2);
    System.out.println(bag2.size());
  }
}
