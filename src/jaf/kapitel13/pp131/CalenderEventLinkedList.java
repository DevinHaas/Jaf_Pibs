package jaf.kapitel13.pp131;

import java.util.LinkedList;

public class CalenderEventLinkedList {

  LinkedList<CalendarEvent> calendarEvents = new LinkedList<>();


  public void addEvent(CalendarEvent event){
    calendarEvents.add(event);
  }


  public void printCalender(){
    for(CalendarEvent event: calendarEvents){
      System.out.println(event);
    }
  }



}
