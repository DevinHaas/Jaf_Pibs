package jaf.kapitel8;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CreatCircles extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  Circle[] circles = new Circle[20];
  Random ran = new Random();


  @Override
  public void start(Stage primaryStage){
    Group root = new Group();
    for (int i = 0; i <= 1; i++) {
      circles[i] = new Circle(ran.nextInt(1000), ran.nextInt(800), ran.nextInt(200));



      if (i >= 1) {
        double xDiv = (circles[i].getCenterX()) - (circles[i-1].getCenterX());
        double yDiv = (circles[i].getCenterY()) - (circles[i-1].getCenterY());

        System.out.println(xDiv);
        System.out.println(yDiv);

        double distance = Math.sqrt(Math.pow(xDiv, 2)) + (Math.pow(yDiv, 2));
        System.out.println(distance);
        double sumRad = circles[i].getRadius() + circles[i - 1].getRadius();
        System.out.println(sumRad);
        if (distance < sumRad) {
          circles[i].setFill(Color.rgb(24, 201, 201, 0.3));
        }
        else{
          circles[i].setFill(Color.BLACK);
        }
      }
      root.getChildren().add(circles[i]);


    }


    Scene scene = new Scene(root, 1200, 1000, Color.DEEPPINK);

    primaryStage.setTitle("The oblivious circle creation");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
