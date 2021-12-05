package jaf.kapitel10.pp101;

public class Executive extends Employee implements Payable {
  private double bonus;

  public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    bonus = 0;
  }

  public void awardBonus(double execBonus) {
    bonus = execBonus;
  }

  @Override
  public double pay1() {
    double payment = super.pay1() + bonus;
    bonus = 0;
    return payment;
  }
}
