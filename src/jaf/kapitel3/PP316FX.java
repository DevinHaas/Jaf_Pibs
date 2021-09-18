package jaf.kapitel3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class PP316FX extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
      Circle mars = new Circle(200, 0, 20, Color.ORANGERED);

      Circle earth = new Circle(0, 250, 20, Color.TURQUOISE);

      Circle venus = new Circle(90, 25, 30, Color.GREY);

      Circle sun = new Circle(40, Color.GOLD);


      Ellipse ellipseEarth = new Ellipse(300, 250);
      ellipseEarth.setFill(null);
      ellipseEarth.setStroke(Color.WHITE);


      Ellipse ellipseMars = new Ellipse(200, 150);
      ellipseMars.setFill(null);
      ellipseMars.setStroke(Color.WHITE);

      Ellipse ellipseVenus = new Ellipse(100, 75);
      ellipseVenus.setFill(null);
      ellipseVenus.setStroke(Color.WHITE);


      Group planets = new Group(sun, mars, venus, earth);
      Group ellipses = new Group(ellipseEarth, ellipseMars, ellipseVenus);
      Group elements = new Group(planets, ellipses);
      elements.setTranslateX(250);
      elements.setTranslateY(250);
      Scene scene = new Scene(elements, 750, 750,  Color.BLACK );

      primaryStage.setTitle("Planets");
      primaryStage.setScene(scene); // display the scene
      primaryStage.show();




  }
}
