package jaf.kapitel4.pp41.src.jaf.kapitel4.pp42;

public class Lights {
    public static void main(String[] args){
        Bulb bulb1 = new Bulb();

        System.out.println(bulb1.isLight());
        bulb1.setLight(true);
        System.out.println(bulb1.isLight());

    }
}
