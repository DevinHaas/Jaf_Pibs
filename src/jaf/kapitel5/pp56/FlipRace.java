package jaf.kapitel5.pp56;

public class FlipRace {

    public static void main(String[] args){
        //creat factors to control if the coins have won
        int factor1 = 0;
        int factor2 = 0;
        int flips = 0;
        boolean win = false;

        //creat two coins
        Coin Coin1 = new Coin();
        Coin Coin2 = new Coin();

        //let them play until win = true, that means 3 times head in a row
        while ((factor1 <= 3) & (factor2 <= 3) & !win) {
            System.out.println(Coin1);
            System.out.println(Coin2 +"\n");

            if (factor1 == 3){
                System.out.println("Coin 1 wins, congratulations !!!");
                win = true;
            }

            if (factor2 == 3)
            {
                System.out.println("Coin 2 wins, congratulations !!!");
                win = true;
            }

            if (factor1 ==3 && factor2==3)
            {
                System.out.println("It is a tie !!!");
            }

            //let the coins flip
            Coin1.flip();
            Coin2.flip();
            flips += 1;

            System.out.println(factor1);
            System.out.println(factor2 + "\n" +"\n");

            //if face is Tail the coin starts from beginning
            if (Coin1.isHead()){
                factor1+=1;
            }
            if (Coin1.isTails())
            {
                factor1 = 0;
            }
            if (Coin2.isHead()){
                factor2+=1;
            }
            if (Coin2.isTails())
            {
                factor2 = 0;
            }
        }
        System.out.println("In this round "+ flips*2 +" flips were needed");

    }
}
