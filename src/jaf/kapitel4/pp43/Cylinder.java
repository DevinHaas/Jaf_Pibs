package jaf.kapitel4.pp43;

// **********************************************************************************************************
//  kapitel4.PP43.java           Author:Devin/Hasler
//  Creat a class for building cylinders with radius and height
// **********************************************************************************************************

import java.text.DecimalFormat;

public class Cylinder {
    private double radius;
    private double height;

    DecimalFormat fmt = new DecimalFormat("0.###");

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * this.height * this.radius + 2 * Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "height : " + getHeight() + " m" + "\t" + " radius : " + getRadius() + " m " + "\t" + " volume : " + fmt.format(volume()) + " cubic meters " + "\t" + " surface area; " + fmt.format(surfaceArea()) + " square meters";
    }
}
