package jaf.kapitel7.pp710fx;

import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseClicked extends Application {

  public static void main(String[] args) {
    launch(args);
  }
  Text clicked;
  int counter = 0;
  @Override
  public void start(Stage primaryStage) {



    clicked = new Text(150, 30, "Mouse clicked: --");

    Group root = new Group(clicked);

    Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);

    //set an event listener for a mouse click
    scene.setOnMouseClicked(this::processMouseClick);

    primaryStage.setTitle("The indestructible mouse click");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void processMouseClick(javafx.scene.input.MouseEvent mouseEvent) {
    //increase a counter and show it in the text area
    counter++;
    clicked.setText("Mouse clicked: " + counter);
  }


}
