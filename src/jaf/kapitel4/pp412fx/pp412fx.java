package jaf.kapitel4.pp412fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

// **********************************************************************************************************
//  kapitel4.PP412FX.java           Author:Devin/Hasler
//  Creat a button which generates a random number
// **********************************************************************************************************

public class pp412fx extends Application {
    private Text numberText;
    Random generator = new Random();                    //creat a generator for random numbers

    public void start(Stage primaryStage) {
        Font font = new Font(30);


        Button button = new Button(" Push ");               //creat a new button
        button.setFont(font);

        numberText = new Text("Number: ");
        numberText.setFont(font);

        button.setOnAction(this::processButtonPress);

        FlowPane pane = new FlowPane(button, numberText);            //add the button and the text field to the pane
        pane.setAlignment(Pos.CENTER);                                //put the pane into the center
        pane.setHgap(30);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Random Number Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processButtonPress(ActionEvent event){                      //creat an action event if button is pressed
        numberText.setText("Number: "+ (generator.nextInt(100) + 1));
    }
}
