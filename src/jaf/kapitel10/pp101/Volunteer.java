package jaf.kapitel10.pp101;

public class Volunteer extends StaffMember implements Payable {
  public Volunteer(String eName, String eAddress, String ePhone) {
    super(eName, eAddress, ePhone);
  }

  @Override
  public double pay1() {
    return 0.0;
  }
}
