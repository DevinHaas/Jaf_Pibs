package jaf.kapitel7.pp72;

public class SalesPerson {
  String name;
  String district;
  int phoneNumber;
  int dailyAmountMo;
  int dailyAmountTu;
  int dailyAmountWe;
  int dailyAmountThu;
  int dailyAmountFr;
  int dailyAmountSa;
  int dailyAmountSu;

  public SalesPerson(String name, int phoneNumber, String district) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.district = district;
  }

  public SalesPerson() {
    this.dailyAmountMo = 0;
    this.dailyAmountTu = 0;
    this.dailyAmountWe = 0;
    this.dailyAmountThu = 0;
    this.dailyAmountFr = 0;
    this.dailyAmountSa = 0;
    this.dailyAmountSu = 0;
  }

  public void setDailyAmount(int dayOfWeek, int dailyAmount) {
    switch (dayOfWeek) {
      case 0:
        this.dailyAmountSu = dailyAmount;
        break;
      case 1:
        this.dailyAmountMo = dailyAmount;
        break;
      case 2:
        this.dailyAmountTu = dailyAmount;
        break;
      case 3:
        this.dailyAmountWe = dailyAmount;
        break;
      case 4:
        this.dailyAmountThu = dailyAmount;
        break;
      case 5:
        this.dailyAmountFr = dailyAmount;
        break;
      case 6:
        this.dailyAmountSa = dailyAmount;
        break;
      default:
        System.out.println("Mistake occurred");
    }
  }

  public int getDailyAmount(int dayOfWeek) {
    switch (dayOfWeek) {
      case 0: return dailyAmountSu;
      case 1: return dailyAmountMo;
      case 2: return dailyAmountTu;
      case 3: return  dailyAmountWe;
      case 4: return  dailyAmountThu;
      case 5: return  dailyAmountFr;
      case 6: return  dailyAmountSa;
      default:
        System.out.println("Mistake occurred");
    }
    return dayOfWeek;
  }

  public int total(){
      return dailyAmountMo + dailyAmountTu + dailyAmountWe + dailyAmountThu + dailyAmountFr + dailyAmountSa + dailyAmountSu;
  }

  public int average(){
    return (dailyAmountMo + dailyAmountTu + dailyAmountWe + dailyAmountThu + dailyAmountFr + dailyAmountSa + dailyAmountSu)/7;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "SalesPerson:" +
        "name='" + name + '\'' +
        ", district='" + district + '\'' +
        ", phoneNumber=" + phoneNumber +
        ", dailyAmountMo=" + dailyAmountMo +
        ", dailyAmountTu=" + dailyAmountTu +
        ", dailyAmountWe=" + dailyAmountWe +
        ", dailyAmountThu=" + dailyAmountThu +
        ", dailyAmountFr=" + dailyAmountFr +
        ", dailyAmountSa=" + dailyAmountSa +
        ", dailyAmountSu=" + dailyAmountSu ;
  }

}
