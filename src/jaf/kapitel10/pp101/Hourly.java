package jaf.kapitel10.pp101;

public class Hourly extends Employee implements Payable {
  private int hoursWorked;

  public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    hoursWorked = 0;
  }

  public void addHours(int moreHours) {
    hoursWorked += moreHours;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += "\nCurrent hours: " + hoursWorked;
    return result;
  }

  @Override
  public double pay1() {
    double payment = payRate * hoursWorked;
    hoursWorked = 0;
    return payment;
  }
}
