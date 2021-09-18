package jaf.kapitel3;

 //*************************************************************************************
//  kapitel3.PP310.java           Author:Devin/Hasler
//  Creat a Snowman with JavaFX and play around with positioning
//*************************************************************************************


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class PP310FX extends Application{
  public void start(Stage primaryStage){


    Ellipse base = new Ellipse(80, 210,80, 60);             //creat the snowman with
    base.setFill(Color.WHITE);                                           //ellipses and circles

    Ellipse middle = new Ellipse(80, 130, 50, 40);
    middle.setFill(Color.WHITE);

    Circle top = new Circle(80, 70, 30);
    top.setFill(Color.WHITE);


    Circle rightEye = new Circle(70, 60, 5);
    Circle leftEye = new Circle(90, 60, 5);
    Line mouth = new Line(70,80,90,80);

    Circle topButton = new Circle(80,110,6);
    topButton.setFill(Color.RED);
    Circle middleButton = new Circle(80,130,6);
    middleButton.setFill(Color.RED);
    Circle bottomButton = new Circle(80,150,6);
    bottomButton.setFill(Color.RED);


    Line leftArm = new Line(110, 130, 160, 130);
    leftArm.setStrokeWidth(3);
    Line rightArm = new Line(50, 130 ,0,  100);
    rightArm.setStrokeWidth(3);

    Rectangle stovepipe = new Rectangle(60, 0, 40 ,50);
    Rectangle brim = new Rectangle(50, 45, 60, 5);

    Group hat = new Group(stovepipe, brim);
    hat.setTranslateX(10);
    hat.setRotate(15);

    Group snowman = new Group(base, middle, top, leftEye, rightEye, mouth, topButton,middleButton, bottomButton,
        leftArm, rightArm, hat);                  //creat a group with the name snowman
    snowman.setTranslateX(210);                   //consisting all the parts
    snowman.setTranslateY(50);

    Circle sun = new Circle(450, 50, 30);
    sun.setFill(Color.GOLD);

    Rectangle ground = new Rectangle(0, 250, 500, 100);
    ground.setFill(Color.ANTIQUEWHITE);

    Text quote = new Text(10, 20, "Devin Hasler");

    Group root = new Group(ground, sun , snowman, quote);             //creat a group with all elements that should
    Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);  //be displayed




    primaryStage.setTitle("Snowman");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
