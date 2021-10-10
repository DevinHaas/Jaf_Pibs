package jaf.kapitel4.pp410fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class pp410fx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Image img1 = new Image("amongus.png");
    Image img2 = new Image("amongus.png");
    Image img3 = new Image("amongus.png");


    ImageView imageView1 = new ImageView(img1);
    ImageView imageView2 = new ImageView(img2);

    ImageView imageView3 = new ImageView(img3);
    FlowPane pane = new FlowPane(imageView1, imageView2, imageView3);

    @Override
    public void start(Stage primaryStage) {


        imageView2.setOnMouseEntered(this::mouseEntered);






        imageView1.setFitHeight(300);
        imageView2.setFitHeight(300);
        imageView3.setFitHeight(300);

        imageView1.setPreserveRatio(true);
        imageView2.setPreserveRatio(true);
        imageView3.setPreserveRatio(true);

        pane.setHgap(20);
        pane.setAlignment(Pos.CENTER);


        Scene scene = new Scene(pane, 800, 800);


        primaryStage.setTitle("wild lions");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void mouseEntered(MouseEvent event) {
        img2 = new Image ("impostor.png");
        System.out.println("hallo");



    }


}
