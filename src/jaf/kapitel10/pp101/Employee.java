package jaf.kapitel10.pp101;

public class Employee extends StaffMember implements Payable {
  protected String socialSecurityNumber;
  protected double payRate;

  public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
    super(eName, eAddress, ePhone);
    socialSecurityNumber = socSecNumber;
    payRate = rate;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += "\nSocial Security Number: " + socialSecurityNumber;
    return result;
  }

  @Override
  public double pay1() {
    return payRate;
  }
}
