package jaf.kapitel7.pp712fx;

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

  private Circle currentCircle;
  private Group root;

  @Override
  //creat a primary Stage with the two Mouse Event Handlers processMousePressed/processMouseDrag
  public void start(Stage primaryStage) {
    root = new Group();

    Scene scene = new Scene(root, 1200, 1000, Color.CADETBLUE);

    scene.setOnMousePressed(this::processMousePressed);
    scene.setOnMouseDragged(this::processMouseDrag);

    primaryStage.setTitle("The absolute creation of circles");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  //creat a method for setting the radius
  private void processMouseDrag(javafx.scene.input.MouseEvent mouseEvent) {
    double radius =
        Math.sqrt(
            Math.pow(mouseEvent.getX() - currentCircle.getCenterX(), 2)
                + Math.pow(mouseEvent.getY() - currentCircle.getCenterY(), 2));

    currentCircle.setRadius(radius);

  }

  //creat a method for setting the center of the new circle
  private void processMousePressed(javafx.scene.input.MouseEvent mouseEvent) {
    double clickX = mouseEvent.getX();
    double clickY = mouseEvent.getY();

    currentCircle = new Circle(clickX, clickY, 2);
    root.getChildren().addAll(currentCircle);


  }
}
