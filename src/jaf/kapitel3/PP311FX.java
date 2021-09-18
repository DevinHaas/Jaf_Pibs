package jaf.kapitel3;

// *************************************************************************************
//  kapitel3.PP311FX.java           Author:Devin/Hasler
//  Creat a target with Circles
// *************************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class PP311FX extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    Circle bigRed = new Circle(250, 250, 100); // creat all the Circles needed
    bigRed.setFill(Color.RED);

    Circle bigWhite = new Circle(250, 250, 80);
    bigWhite.setFill(Color.WHITE);

    Circle midRed = new Circle(250, 250, 60);
    midRed.setFill(Color.RED);

    Circle smallWhite = new Circle(250, 250, 40);
    smallWhite.setFill(Color.WHITE);

    Circle smallRed = new Circle(250, 250, 20);
    smallRed.setFill(Color.RED);

    Group aim = new Group(bigRed, bigWhite, midRed, smallWhite, smallRed); // put all the circles
    Scene scene = new Scene(aim, 500, 500, Color.BLACK);            // in a Group and with
                                                                          // in the correct order
    primaryStage.setTitle("AIM");
    primaryStage.setScene(scene); // display the scene
    primaryStage.show();
  }
}
