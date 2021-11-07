package jaf.kapitel7.pp79;

public class TestAccountLock {
    public static void main(String[] args){
        System.out.println("Welcome Sir/Miss to your Bank of trust, these are the newest transactions: "+ "\n");

        AccountLocable acct1 = new AccountLocable("Thomas Shelby",4444444, 100000 );
        AccountLocable acct2 = new AccountLocable("Alfie Solomons", 222222, 100);

        System.out.println(acct1);
        System.out.println(acct2);

        acct1.setKey(44);
        acct2.setKey(22);

        System.out.println(acct1);
        System.out.println(acct2);

        acct1.unlock(44);
        acct2.unlock(22);

        System.out.println(acct1);
        System.out.println(acct2);
    }
}
