package jaf.kapitel12.pp122;

public class Bag {

  private Bag testBag;
  private Object object;
  private int size;

  // We don't need a constructor here because in the method addItem a new Bag is created

  public void addItem(Object item) {
    if (this.bagIsEmpty()) {
      object = item;
      testBag = new Bag();
      size += 2;
    } else {
      testBag.addItem(item);
      size++;
    }
  }

  public String size() {
    return "The bag contains of " + size + " elements\n";
  }

  private boolean bagIsEmpty() {
    return object == null;
  }

  public String toString() {
    if (testBag.bagIsEmpty()) {
      return "(" + object + "," + "Empty)";
    }
    return "(" + object + "," + testBag + ")";
  }
}
