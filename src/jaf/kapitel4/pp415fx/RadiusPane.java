package jaf.kapitel4.pp415fx;

import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;


// ***********************************************************************
//  kapitel4.PP15FX.java           Author:Devin/Hasler
//  Creat a class RadiusPane with a GUI to creat your own circles
// ***********************************************************************

public class RadiusPane extends StackPane {
    private final TextField radius ;
    Circle circle = new Circle(250,250, 0);

    public RadiusPane() {
        Font font = new Font(16);

        radius = new TextField();               //creat a text field for entering your radius
        radius.setFont(font);
        radius.setMaxWidth(100);
        radius.setMaxHeight(50);
        radius.setAlignment(Pos.CENTER);
        radius.setOnAction(this::processReturn);             //set an action event if return is pressed

        setStyle("-fx-background-color: black ");
        setAlignment(Pos.CENTER);

        getChildren().add(circle);                  //add circle and radius to the stack pane
        getChildren().add(radius);
    }
    public void processReturn(ActionEvent event){               //creat an action event

        int radiusNumber = Integer.parseInt(radius.getText());          //the number in the Text field becomes the radius
        circle.setFill(Color.WHITE);
        circle.setRadius(radiusNumber);







    }

}
