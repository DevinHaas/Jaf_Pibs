package jaf.kapitel5.beispiel_radio_buttons;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuoteChoose extends Application {


    @Override
    public void start(Stage primaryStage) {
        QuoteChoosePane pane = new QuoteChoosePane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightblue");

        Scene scene = new Scene(pane, 500, 150);

        primaryStage.setTitle("Quote Options");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
