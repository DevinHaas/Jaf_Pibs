package jaf.kapitel7.pp79;

import java.text.NumberFormat;

public class AccountLockable {
  private final long acctNumber;
  private double balance;
  private final String name;
  private int key;
  private boolean locked;

  public AccountLockable(String owner, long accountNumber, double initial) {
    name = owner;
    acctNumber = accountNumber;
    balance = initial;
    locked = false;
  }

  public void setKey(int key) {
    this.key = key;
    locked = true;
  }

  public void lock(int key) {
    if (key == this.key) {
      this.locked = true;
    }
  }

  public void unlock(int key) {
    if (key == this.key) {
      this.locked = false;
    }
  }

  public boolean locked() {
    return locked;
  }


  public void deposit(double amount) {
    if (!locked) {
      if (amount < 0) System.out.println("The amount of deposit can not be negative \n");

      balance = balance + amount;
    } else{
      System.out.println("Sorry the System is locked.\n");
    }
  }

  public void withdraw(double amount, double fee) {
    if (!locked) {
      balance = balance - amount - fee;
      if (balance < 0) {
        System.out.println("Sorry, " + this.name + " your balance is to small for this withdraw\n");
        balance = balance + amount + fee;
      }
    } else {
      System.out.println("Sorry the System is locked.\n");
    }
  }

  public void addInterest() {
    if (locked) {
      System.out.println("Sorry the Account is locked.");
    } else {
      double rate = 0.035;
      balance += (balance * rate);
    }
  }

  public Object getBalance() {
    if (locked) {
      return null;
    } else {
      return balance;
    }
  }


  public String toString() {
    if (!locked) {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return acctNumber + "\t" + name + "\t" + fmt.format(balance) + "\n" + "key:" + key + "\n";
    } else {
      return "The account of " + name + " is locked.\n";
    }
  }
}
