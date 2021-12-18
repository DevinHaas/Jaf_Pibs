package jaf.kapitel13b.pp131;

public class CalenderEventList {

  private CalenderEventNode list;

  public CalenderEventList() {
    list = null;
  }

  public void add(CalendarEvent event) {
    CalenderEventNode node = new CalenderEventNode(event);
    CalenderEventNode current;

    if (list == null) {
      list = node;
    } else {
      current = list;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    CalenderEventNode current = list;

    while (current != null) {
      result.append(current.event).append("\n");
      current = current.next;
    }
    return result.toString();
  }

  private class CalenderEventNode {

    public CalendarEvent event;
    public CalenderEventNode next;

    public CalenderEventNode(CalendarEvent calendarEvent) {
      event = calendarEvent;
      next = null;
    }
  }
}
