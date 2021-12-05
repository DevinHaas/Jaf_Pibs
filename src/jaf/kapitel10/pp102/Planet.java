package jaf.kapitel10.pp102;

public class Planet {

  String name;
  double mass;
  double diameter;
  double distance;
  String atmosConditions;
  int numberMoons;
  String moon = " moon";
  String beginning = "The planet";

  public Planet(
      String name,
      double mass,
      double diameter,
      double distance,
      String atmosConditions,
      int numberMoons) {
    this.name = name;
    this.mass = mass;
    this.diameter = diameter;
    this.distance = distance;
    this.atmosConditions = atmosConditions;
    this.numberMoons = numberMoons;
  }

  public String toString() {

    if (numberMoons > 1) {
      moon = " moons";
    }
    return "Planet "
        + name
        + " has a mass of "
        + mass
        + " kilograms, \n a diameter of "
        + diameter
        + " kilometers, \n a distance to the sun of "
        + distance
        + " kilometers, \n and "
        + numberMoons
        + moon
        + " \n the atmosperic Condition is "
        + atmosConditions
        + "\n";
  }
}
