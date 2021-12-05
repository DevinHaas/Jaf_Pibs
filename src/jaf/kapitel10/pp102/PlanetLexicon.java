package jaf.kapitel10.pp102;

public class PlanetLexicon {
  public static void main(String[] args) {

    Planet earth =
        new Planet(
            "earth",
            Math.pow(10, 24) * 5.9724,
            12713.50,
            Math.pow(10, 6) * 147,
            "78.08% nitrogen (N2; dry air)\n 20.95% oxygen (O2)\n and other gases.",
            1);


    Planet mars =
        new Planet(
            "Mars",
            Math.pow(10, 23) * 6.417,
            6800,
            Math.pow(10, 6) * 228,
            """
                Kohlenstoffdioxid: 95,32 %
                Stickstoff: 2,7 %
                Argon: 1,6 %
                """,
            2);

    ExoPlanet tau = new ExoPlanet("Tau Ceti e",
        Math.pow(10, 30) * 1.53153,
        538271, Math.pow(10, 14) * 1.126213,
        "helium and nitrogen",
        0,
        "sun" );

    System.out.println(earth);
    System.out.println(mars);
    System.out.println(tau);
  }
}
