package jaf.kapitel10.pp102;

public class ExoPlanet extends Planet {

  String nameOfStar;

  public ExoPlanet(
      String name,
      double mass,
      double diameter,
      double distance,
      String atmosConditions,
      int numberMoons,
      String nameOfStar) {
    super(name, mass, diameter, distance, atmosConditions, numberMoons);
    this.nameOfStar = nameOfStar;
  }

  @Override
  public String toString() {

    String result = super.toString();
    beginning = "Exo";
    return beginning + result + " \n The exoplanet resolves around " + nameOfStar + "\n";
  }
}
