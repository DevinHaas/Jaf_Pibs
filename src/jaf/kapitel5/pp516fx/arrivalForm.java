package jaf.kapitel5.pp516fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class arrivalForm extends Application {


    @Override
    public void start(Stage primaryStage) {

        arrivalFormPane pane = new arrivalFormPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane, 1000, 800);

        primaryStage.setTitle("Arrival Form");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
