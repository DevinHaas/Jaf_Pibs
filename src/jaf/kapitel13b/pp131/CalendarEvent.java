package jaf.kapitel13b.pp131;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEvent {

  String title;
  Calendar date;
  String startTime;
  String duration;
  String dateFormat;

  public CalendarEvent(String title, Calendar date, String startTime, String duration) {
    this.title = title;
    this.date = date ;
    this.startTime = startTime;
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "CalendarEvent{"
        + "title='"
        + title
        + '\''
        + ", date="
        + date
        + ", startTime='"
        + startTime
        + '\''
        + ", duration='"
        + duration
        + '\''
        + '}';
  }
}
