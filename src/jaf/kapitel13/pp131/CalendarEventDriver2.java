package jaf.kapitel13.pp131;

import java.sql.Date;

public class CalendarEventDriver2 {
  public static void main(String[] args) {
    CalenderEventLinkedList list = new CalenderEventLinkedList();

    list.addEvent(new CalendarEvent("FFHS", new Date(201987), "8:45", "400"));
    list.addEvent(new CalendarEvent("Date", new Date(2019822), "18:30", "120"));
    list.addEvent(new CalendarEvent("Match", new Date(2019914), "13:00", "150"));
    list.addEvent(new CalendarEvent("Physio", new Date(2019915), "10:00", "40"));
    list.addEvent(new CalendarEvent("Psychologist", new Date(2019310), "14:00", "60"));
    list.addEvent(new CalendarEvent("Chess Training", new Date(201975), "19:00", "90"));
    list.addEvent(new CalendarEvent("Dentist", new Date(2019105), "11:00", "30"));
    list.addEvent(new CalendarEvent("Match", new Date(2019921), "18:00", "150"));
    list.addEvent(new CalendarEvent("Birthday Party", new Date(20191115), "20:00", "300"));
    list.addEvent(new CalendarEvent("Psychologist", new Date(2019104), "16:00", "60"));


    list.printCalender();
  }
}
