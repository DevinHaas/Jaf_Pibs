package jaf.kapitel4.pp43;

import java.text.DecimalFormat;

public class MultiCylinder {
    public static void main(String[] args){
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder();

        cylinder1.setHeight(2.0);
        cylinder1.setRadius(2.0);

        cylinder2.setRadius(3.5);
        cylinder2.setHeight(9);

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());

    }
}
