package jaf.kapitel4.pp415fx;


// **********************************************************************************************************
//  kapitel4.PP415FX.java           Author:Devin/Hasler
//  Creat a primaryStage class for creating the new Radius Pane in the second part of this exercise
// **********************************************************************************************************


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class pp415start extends Application {


    @Override
    public void start(Stage primaryStage) {                 //creat primaryStage

        Scene scene = new Scene(new RadiusPane() ,500, 500);        //creat a new scene with the RadiusPane()
        primaryStage.setTitle("The ultimate circle drawer");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
