package jaf.kapitel6.pp611;


import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class PP611 extends Application {

  Random gen = new Random();
  @Override
  public void start(Stage primaryStage) {


    Group group = new Group();
    double height = 40;
    //use the random generator to give the lines random lengths


    //creat a for loop that creates 20 lines
    for(int i = 0; i <= 20; i++){

      Line line = new Line();
      //creat the start of the line between 20 and 500
      line.setStartX(gen.nextDouble(500)+20);
      line.setStartY(height);
      line.setEndX(gen.nextDouble(500));
      line.setEndY(height);
      Color myColor;
      myColor = new Color(gen.nextDouble(1), gen.nextDouble(1), gen.nextDouble(1), gen.nextDouble(1));
      line.setStroke(myColor);
      //add every created line to a group
      group.getChildren().add(line);

      //increase the y end and start point for the lines to be parallel
      height+= 20;
    }

    Scene scene = new Scene(group, 700, 700);

    primaryStage.setTitle("Lines");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}
