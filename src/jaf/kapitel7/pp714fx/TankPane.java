package jaf.kapitel7.pp714fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TankPane extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  Tank tank2 = new Tank();
  Text text = new Text();
  Text textCanon = new Text();
  Group root = new Group();

  @Override
  public void start(Stage primaryStage) {
    text.setX(100);
    root.getChildren().addAll(tank2, text, textCanon);

    Scene scene = new Scene(root, 1400, 1000, Color.WHITE);

    scene.setOnMouseMoved(this::moveTank);
    scene.setOnMousePressed(this::processMousePressed);
    scene.setOnMouseReleased(this::processMouseRelease);

    primaryStage.setTitle("Tank");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public void moveTank (MouseEvent mouseEvent){
    double posX = mouseEvent.getX();
    double posY = mouseEvent.getY();

    String posx = String.valueOf(posX);
    text.setText(posx);

    tank2.setTranslateX(posX);
    tank2.setTranslateY(posY);

    textCanon.setText("\n" + tank2.getLayoutX());



  }

  public void processMousePressed (MouseEvent mouseEvent){

    tank2.addBeam();

  }
  public void processMouseRelease (MouseEvent mouseEvent){
    tank2.removeBeam();
  }
}
