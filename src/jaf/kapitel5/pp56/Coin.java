package jaf.kapitel5.pp56;

public class Coin {

    private final int TAILS = 1;
    private int face;

    public Coin() {
        flip();
    }
    //creat a method that flips the coins (generates a number between 0 and 1)
    public void flip(){
        face = (int)(Math.random()*2);
    }
    //creat two methods to check if it is Head or Tail
    public boolean isHead(){
        int HEADS = 0;
        return (face== HEADS);
    }
    public boolean isTails(){
        return (face==TAILS);
    }


    public String toString() {
        if (face==TAILS)
            return "Tail";
        else
            return "Head";
    }
}
