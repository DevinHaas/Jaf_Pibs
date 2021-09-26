package jaf.kapitel4.pp41.src.jaf.kapitel4.pp45;

// ********************************************************************************************
//  kapitel4.PP45.java           Author:Devin/Hasler
//  Creat the class CarTest to make it possible to creat cars including make, model and year
// ********************************************************************************************

public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setYear(2022);                         //creat a Hyundai Car and set the year and the model
        car1.setMake("Hyundai");
        car1.setModel("Elantra Hybrid");

        car2.setYear(1971);
        car2.setMake("Rolls-Royce");
        car2.setModel("Corniche");

        System.out.println(car1);               //access the method toString and print a one-line description
        System.out.println(car2);


    }

}
