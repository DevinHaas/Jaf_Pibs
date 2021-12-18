package jaf.kapitel13.pp131;

import java.sql.Time;
import java.util.GregorianCalendar;

public class CalenderEvent {

  String title;
  GregorianCalendar date;
  GregorianCalendar startTime;
  int duration;


  public CalenderEvent(String title, GregorianCalendar date, GregorianCalendar startTime, int duration){
    this.title = title;
    this.date = date;
    this.startTime = startTime;
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "CalenderEvent{" +
        "title='" + title + '\'' +
        ", date=" + date +
        ", startTime=" + startTime +
        ", duration=" + duration +
        '}';
  }
}
