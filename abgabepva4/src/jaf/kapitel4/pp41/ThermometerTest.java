package jaf.kapitel4.pp41;

// *************************************************************************************
//  kapitel4.PP41.java           Author:Devin/Hasler
//  Use the Class Thermometer to do a Thermometer Test with two Thermometers
// *************************************************************************************

public class ThermometerTest {
    public static void main(String[] args){
        Thermometer thermometer1 = new Thermometer();               //creat two new Thermometers
        Thermometer thermometer2 = new Thermometer();
        thermometer1.increase();
        thermometer2.setTemperature(70.0);                          //set the Temperature to 70.0
        System.out.println(thermometer1.getTemperature());
        System.out.println(thermometer2.getTemperature());
        thermometer1.reset();                                       //reset the Temperature to 37.0
        thermometer2.reset();
        System.out.println(thermometer1.getTemperature());
        System.out.println(thermometer2.getTemperature());

    }
}
