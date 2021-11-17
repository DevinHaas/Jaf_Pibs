package jaf.kapitel7.pp714fx;

import com.sun.prism.image.ViewPort;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Tank extends Group {

  Rectangle canon;
  Rectangle beam;

  public Tank(){
    Rectangle crawlerTop = new Rectangle(0,0, 100, 20);
    crawlerTop.setFill(Color.DARKGREY);

    Rectangle body = new Rectangle(0, 20, 100, 100);
    body.setFill(Color.DARKGREEN);

    Circle bodyCover = new Circle(50,70, 20);
    bodyCover.setFill(null);
    bodyCover.setStroke(Color.BLACK);

    Rectangle crawlerBottom = new Rectangle(0,120, 100, 20);
    crawlerBottom.setFill(Color.DARKGREY);

    canon = new Rectangle(100, 60, 60, 20);
    canon.setFill(Color.DARKGREEN);

    beam = new Rectangle(160,60, 2000, 20);
    beam.setFill(Color.RED);

    getChildren().addAll(crawlerTop, body, canon, crawlerBottom, bodyCover);
  }

  public void removeBeam(){
    getChildren().remove(beam);
  }

  public void addBeam(){
    getChildren().add(beam);
  }
}
