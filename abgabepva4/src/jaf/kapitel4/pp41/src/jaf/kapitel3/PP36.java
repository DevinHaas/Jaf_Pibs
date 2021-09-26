package jaf.kapitel4.pp41.src.jaf.kapitel3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PP36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a radius of a sphere: " );
        float radius = scan.nextFloat();

        float volume;
        volume = (float) ((4 / 3) * Math.PI * (Math.pow(radius, 2)));
        float surfaceArea = (float) (4 * Math.PI * (Math.pow(radius, 2)));
        DecimalFormat fmt = new DecimalFormat("0.####");

        System.out.println("The volume is: "+ fmt.format(volume)+ " and the surface is: "+ fmt.format(surfaceArea));




    }

}
