package jaf.kapitel4.pp41.src.jaf.kapitel3;

//*************************************************************************************
//  kapitel3.PP314FX.java           Author:Devin/Hasler
//  Rotate a name with random degree
//*************************************************************************************

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class PP314FX extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Random generator = new Random();                        //creat a new random number generator
    Text name = new Text(250, 250, "Devin Hasler");     //creat my Name

    Group text = new Group(name);
    text.setRotate(generator.nextInt(361));         //set the rotation number to random

    Scene scene = new Scene(text, 500, 500);

    primaryStage.setTitle("Rotation of Name");
    primaryStage.setScene(scene);
    primaryStage.show();





  }
}
