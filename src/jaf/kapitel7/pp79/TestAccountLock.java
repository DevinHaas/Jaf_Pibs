package jaf.kapitel7.pp79;

public class TestAccountLock {
    public static void main(String[] args){
        System.out.println("Welcome Sir/Miss to your Bank of trust, these are the newest transactions: "+ "\n");

        //creat two accounts
        AccountLockable acct1 = new AccountLockable("Thomas Shelby",4444444, 100000 );
        AccountLockable acct2 = new AccountLockable("Alfie Solomons", 222222, 100);

        //print the lock state of the accounts
        System.out.println(acct1.locked());
        System.out.println(acct1.locked());

        System.out.println(acct1);
        System.out.println(acct2);

        //set a key for locking and unlocking the accounts
        acct1.setKey(44);
        acct2.setKey(22);

        //print the account information after setting a key and locking it at the same time
        System.out.println(acct1);
        System.out.println(acct2);

        acct1.unlock(44);
        acct2.unlock(22);

        System.out.println(acct1);
        System.out.println(acct2);

        acct1.lock(44);
        acct2.lock(22);

        System.out.println(acct1.locked());
        System.out.println(acct1.locked());

        System.out.println(acct1.getBalance());
        System.out.println(acct1.getBalance());
        acct1.addInterest();
        acct1.withdraw(100,2);
        acct1.deposit(100);

    }
}
