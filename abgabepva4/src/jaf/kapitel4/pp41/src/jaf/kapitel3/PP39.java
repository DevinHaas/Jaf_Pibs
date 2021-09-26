package jaf.kapitel4.pp41.src.jaf.kapitel3;

import java.text.DecimalFormat;
import java.util.Random;


public class PP39 {
    public static void main(String[] args){
        Random generator = new Random();

        DecimalFormat fmt = new DecimalFormat("0.###");
        int radius = generator.nextInt(20)+ 1;
        int height = generator.nextInt(20)+ 1;

        System.out.println("The surface is: "+ fmt.format(2*Math.PI* radius * height));
        System.out.println("The volume is: " + fmt.format(Math.PI * Math.pow(radius, 2)*height));


    }
}
