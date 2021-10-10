package jaf.kapitel4.pp45;

// ********************************************************************************************
//  kapitel4.PP45.java           Author:Devin/Hasler
//  Creat the class CarTest to make it possible to creat cars including make, model and year
// ********************************************************************************************

public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car("Audi","R8",2012);       ////creat a Audi Car and set the year and the model
        Car car2 = new Car("Rolls-Royce", "Corniche", 1971);


        System.out.println(car1);               //access the method toString and print a one-line description
        System.out.println(car2);

        System.out.println(car1.getMake());
        System.out.println(car1.isAntique());



    }

}
