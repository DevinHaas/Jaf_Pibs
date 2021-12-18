package jaf.kapitel13b.pp131;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderEventListDriver {

  public static void main(String[] args) {
    CalenderEventList myCalender = new CalenderEventList();

    myCalender.add(new CalendarEvent("Dentist", new GregorianCalendar(2021, Calendar.DECEMBER,5), "10:00", "1"));
    myCalender.add(new CalendarEvent("Fitness", new GregorianCalendar(2019, Calendar.AUGUST,5), "10:00", "1"));
    myCalender.add(new CalendarEvent("School", new GregorianCalendar(2002, Calendar.SEPTEMBER,5), "08:00", "3"));
    myCalender.add(new CalendarEvent("Work", new GregorianCalendar(1980, Calendar.JUNE,5), "08:00", "7"));
    myCalender.add(new CalendarEvent("Birthday", new GregorianCalendar(1999, Calendar.MAY,5), "15:00", "4"));
    myCalender.add(new CalendarEvent("Lunch", new GregorianCalendar(2021, Calendar.DECEMBER,5), "12:00", "1"));

    System.out.println(myCalender);
  }
}
