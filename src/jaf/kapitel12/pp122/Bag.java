package jaf.kapitel12.pp122;

public class Bag {

  private Bag testBag;
  private Object object;

  public void addItem(Object item) {
    if (this.bagIsEmpty()) {
      object = item;
      testBag = new Bag();

    } else {
      testBag.addItem(item);
    }
  }

  private boolean bagIsEmpty() {
    return object == null;
  }


  public String toString() {}
}
