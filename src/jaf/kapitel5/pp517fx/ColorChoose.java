package jaf.kapitel5.pp517fx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ColorChoose extends Application {


    @Override
    public void start(Stage primaryStage) {
        ColorChoosePane pane = new ColorChoosePane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightblue");

        Scene scene = new Scene(pane, 500, 150);

        primaryStage.setTitle("Quote Options");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
