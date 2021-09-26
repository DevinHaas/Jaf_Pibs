package jaf.kapitel4.pp41.src.jaf.kapitel4.pp41;

// *************************************************************************************
//  kapitel4.PP41.java           Author:Devin/Hasler
//  Build a Class Thermometer with different methods
// *************************************************************************************

public class Thermometer {
    private double temperature;

    public Thermometer() {
        this.temperature = 37.0;
    }               //creat a new constructor method and set the
                                                //temperature to 37
    public void setTemperature(double temperature) {            //make it possible to set the
        this.temperature = temperature;
    }

    //temperature
    public void increase() {
        this.temperature += 0.1;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void reset() {
        this.temperature = 37.0;
    }                           //creat a method that resets the
}                                                                              //temperature
