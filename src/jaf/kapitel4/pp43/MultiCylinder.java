package jaf.kapitel4.pp43;

// **********************************************************************************************************
//  kapitel4.PP43.java           Author:Devin/Hasler
//  Creat a MultiCylinder class for building different cylinders with radius and height
// **********************************************************************************************************

public class MultiCylinder {
    public static void main(String[] args){
        Cylinder cylinder1 = new Cylinder(2.0,2.0);         //creat two cylinders
        Cylinder cylinder2 = new Cylinder(9.0,3.5);

        System.out.println(cylinder1);
        System.out.println(cylinder2);

        cylinder1.setHeight(9.0);
        cylinder1.setRadius(9.0);

        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder2.getRadius());



    }
}
