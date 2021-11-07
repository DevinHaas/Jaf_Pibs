package jaf.kapitel7.pp71;

public class Transactions2 {
  public static void main(String[] args){
    System.out.println("Welcome Sir/Miss to your Bank of trust, these are the newest transactions: "+ "\n");

    //creat two new bank accounts
    Account2 acct1 = new Account2("Mr Thomas Shelby",44444);
    //print infos before adding balance
    System.out.println(acct1);

    //add balance with interface and print infos afterwards
    acct1.setBalance(1000);
    System.out.println(acct1);

    Account2 acct2 = new Account2("Mr Alfie Solomons", 22222);
    System.out.println(acct2.getBalance());



    //add a deposit to account2
    acct2.deposit(9999);
    System.out.println(acct2);

    //withdraw too much to see if error message is printed
    acct2.withdraw(190000,0);
    System.out.println(acct2);









  }

}
