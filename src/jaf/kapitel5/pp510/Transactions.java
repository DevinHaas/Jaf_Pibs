package jaf.kapitel5.pp510;

public class Transactions {
    public static void main(String[] args){
        System.out.println("Welcome Sir/Miss to your Bank of trust, these are the newest transactions: "+ "\n");

        //creat two new bank accounts
        Account acct1 = new Account("Mr Thomas Shelby",44444,10000);
        Account acct2 = new Account("Mr Alfie Solomons", 22222, 191919);

        //print the current infos about the account
        System.out.println(acct1);
        System.out.println(acct2);


        //add a deposit to account1
        acct1.deposit(1000);
        System.out.println(acct1);

        //make a withdrawal with account2
        acct2.withdraw(190000,0);
        System.out.println(acct2);

        //withdraw too much to see if error message is printed
        acct2.withdraw(1919, 100);






    }
}
