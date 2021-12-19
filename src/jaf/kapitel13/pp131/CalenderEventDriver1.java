package jaf.kapitel13.pp131;

import java.sql.Date;

public class CalenderEventDriver1 {

  public static void main(String[] args) {
    CalenderEventList myCalender = new CalenderEventList();

    myCalender.add(new CalendarEvent("FFHS", new Date(201987), "8:45", "400"));
    myCalender.add(new CalendarEvent("Date", new Date(2019822), "18:30", "120"));
    myCalender.add(new CalendarEvent("Match", new Date(2019914), "13:00", "150"));
    myCalender.add(new CalendarEvent("Physio", new Date(2019915), "10:00", "40"));
    myCalender.add(new CalendarEvent("Psychologist", new Date(2019310), "14:00", "60"));
    myCalender.add(new CalendarEvent("Chess Training", new Date(201975), "19:00", "90"));
    myCalender.add(new CalendarEvent("Dentist", new Date(2019105), "11:00", "30"));
    myCalender.add(new CalendarEvent("Match", new Date(2019921), "18:00", "150"));
    myCalender.add(new CalendarEvent("Birthday Party", new Date(20191115), "20:00", "300"));
    myCalender.add(new CalendarEvent("Psychologist", new Date(2019104), "16:00", "60"));

    System.out.println(myCalender);
  }
}
