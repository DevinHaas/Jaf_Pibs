package jaf.kapitel13.pp135;

public class Car {

  String brand;
  String modell;
  int ps;
  String color;

  public Car(String brand, String model, int ps, String color){
    this.brand = brand;
    this.modell = model;
    this.ps = ps;
    this.color = color;
  }


  public String toString(){
    return color + " car " + brand + " " + modell + "\n";
  }

  public String carEntered(){
    return "The car " + brand + " "+ modell + " with the " + color + " Color has entered";
  }


  public String carLefts(){
    return "The car " + brand + " "+ modell + " with the " + color + " Color has left";
  }




}
