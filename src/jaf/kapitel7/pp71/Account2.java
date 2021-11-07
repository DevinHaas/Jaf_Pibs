package jaf.kapitel7.pp71;

import java.text.NumberFormat;

public class Account2 implements Balance {

  private final long acctNumber;
  private double balance;
  private final String name;


  public Account2(String owner, long account){
    name = owner;
    acctNumber = account;
    balance = 0;

  }

  public void deposit(double amount){

    if (amount < 0)
      System.out.println("The amount of deposit can not be negative");

    balance = balance + amount;
  }

  public void withdraw(double amount, double fee){

    balance =balance - amount- fee;
    if (balance < 0)
    {
      System.out.println("Sorry, "+ this.name+ " your balance is to small for this withdraw");
      balance = balance + amount + fee;
    }
  }

  public double addInterest(){
    double RATE = 0.035;
    balance += (balance * RATE);
    return balance;
  }

  @Override
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance(){
    return balance;
  }


  public String toString(){
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return acctNumber + "\t" + name + "\t" + fmt.format(balance)+"\n";
  }




}
