package jaf.kapitel4.pp411fx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// **********************************************************************************************************
//  kapitel4.PP411FX.java           Author:Devin/Hasler
//  Creat a Grid Pane to make it possible to creat 4 different views of a lion
// **********************************************************************************************************

public class PP411FX extends Application {

    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();                 //creat a new Grid pane

        Image img = new Image("lion.jpg");

        ImageView imgViewLeftTop = new ImageView(img);          //great 4 new Image Views of the lion
        ImageView imgViewRightTop = new ImageView(img);
        ImageView imgViewRightBottom = new ImageView(img);
        ImageView imgViewLeftBottom = new ImageView(img);


        imgViewLeftTop.setViewport(new Rectangle2D(1200,600,400,400));              //give them a view port
        imgViewRightTop.setViewport(new Rectangle2D(1600, 600, 400, 400));
        imgViewLeftBottom.setViewport(new Rectangle2D(1200, 1000, 400, 400 ));
        imgViewRightBottom.setViewport(new Rectangle2D(1600, 1000, 400, 400));


        //rotate the Viewports
        //imgViewRightBottom.setRotate(90);
        //imgViewLeftBottom.setRotate(90);


        GridPane.setHalignment(imgViewLeftTop, HPos.LEFT);
        GridPane.setHalignment(imgViewRightTop, HPos.RIGHT);

        pane.setStyle("-fx-background-color: black");                       //set the background to black

        Scene scene = new Scene(pane, 800, 800);

        pane.add(imgViewLeftTop, 0,0);                  //give the imgViews a place in the gride
        pane.add(imgViewRightTop, 1, 0);
        pane.add(imgViewLeftBottom, 0,1);
        pane.add(imgViewRightBottom, 1, 1);
        pane.setHgap(10);                               //set distance between the horizontal and vertical
        pane.setVgap(10);

        primaryStage.setTitle("lion in grid");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
