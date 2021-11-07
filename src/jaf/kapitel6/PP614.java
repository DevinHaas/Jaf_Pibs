package jaf.kapitel6;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PP614 extends Application {

  Random gen = new Random();

  @Override
  public void start(Stage primaryStage) {

    // creat a group for grouping all the circles
    Group group = new Group();

    for (int i = 0; i <= 100; i++) {

      // creat a random x Position , y Position and size for every Circle
      int xPos = gen.nextInt(1200) + 100;
      int yPos = gen.nextInt(800) + 100;
      int size = gen.nextInt(100);
      Circle circle = new Circle(xPos, yPos, size);
      // creat a random color
      Color myColor =
          new Color(gen.nextDouble(1), gen.nextDouble(1), gen.nextDouble(1), gen.nextDouble(1));
      circle.setStroke(myColor);
      circle.setFill(myColor);
      // add the circle to group
      group.getChildren().addAll(circle);
    }
    Scene scene = new Scene(group, 1500, 1000);

    primaryStage.setTitle("The caos of circles");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
