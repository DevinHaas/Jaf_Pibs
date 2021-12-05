package jaf.kapitel10.pp101;

public abstract class StaffMember implements Payable {

  protected String name;
  protected String address;
  protected String phone;

  protected StaffMember(String eName, String eAddress, String ePhone) {
    name = eName;
    address = eAddress;
    phone = ePhone;
  }

  public String toString() {
    String result = "Name: " + name + "\n";
    result += "Address: " + address + "\n";
    result += "Phone: " + phone;
    return result;
  }

  @Override
  public double pay1() {
    return 0.0;
  }
}
