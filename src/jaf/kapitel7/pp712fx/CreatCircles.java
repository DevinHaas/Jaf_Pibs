package jaf.kapitel7.pp712fx;

import java.awt.event.MouseEvent;
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
  public void start(Stage primaryStage) {
    root = new Group();

    Scene scene = new Scene(root, 500, 500, Color.CADETBLUE);

    scene.setOnMouseClicked(this::processMouseClick);
    scene.setOnMouseDragged(this::processMOuseDrag);

    primaryStage.setTitle("The absolute creation of circles");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void processMouseClick(javafx.scene.input.MouseEvent mouseEvent) {
      double clickX = mouseEvent.getX();
      double clickY = mouseEvent.getY();

      currentCircle.setCenterX(clickX);
      currentCircle.setCenterY(clickY);


      root.getChildren().addAll(currentCircle);
  }

  private  void processMouseDrag(MouseEvent mouseEvent){
    int radius = currentCircle.getRadius() - mouseEvent.
  }

}
