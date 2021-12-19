package jaf.kapitel13.pp131;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarEvent {

  String title;
  Date date;
  String startTime;
  String duration;

  public CalendarEvent(String title, Date date, String startTime, String durationMin) {
    this.title = title;
    this.date = date;
    this.startTime = startTime;
    this.duration = durationMin;
  }

  @Override
  public String toString() {
    Date date = new Date();

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");

    String day = simpleDateFormat.format(date);

    simpleDateFormat = new SimpleDateFormat("mm");
    String month = simpleDateFormat.format(date);

    simpleDateFormat = new SimpleDateFormat("yyyy");
    String year = simpleDateFormat.format(date);

    return "CalendarEvent ->"
        + "\n"
        + "title :"
        + title
        + "\n"
        + " date : "
        + year
        + " "
        + month
        + " "
        + day
        + " startTime :"
        + startTime
        + "\n"
        + " duration = "
        + duration
        + " min"
        + "\n";
  }
}
