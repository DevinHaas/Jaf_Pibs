package jaf.kapitel4.pp45;

// *************************************************************************************
//  kapitel4.PP45.java           Author:Devin/Hasler
//  Creat the class Car to make it possible to creat cars including make, model and year
// *************************************************************************************

public class Car {
    private String make;
    private String model;
    private int year;
    final int thisYear = 2021;

    public Car(){
        this.make = "";
        this.model = "";
        this.year = 0;
    }

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return this.make;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public boolean isAntique(){
        int age = this.thisYear - this.year;
        return age > 45;
    }

    public String toString(){
        return "make: "+ getMake()+"\t"+"\t"+" year: "+ getYear() +"\t\t"+ " model: "+ getModel() + "\t" +" This car is antique: " +isAntique();
    }
}
