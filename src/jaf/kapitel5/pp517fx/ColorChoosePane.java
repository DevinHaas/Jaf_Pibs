package jaf.kapitel5.pp517fx;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class ColorChoosePane extends HBox {


    private final Rectangle rectangle;
    private final RadioButton redButton;
    private final RadioButton yellowButton;
    private final RadioButton greenButton;
    private final RadioButton blueButton;
    private final RadioButton blackButton;


    public ColorChoosePane()
    {

        rectangle = new Rectangle(100, 150);
        rectangle.setRotate(90);

        StackPane colorPane = new StackPane(rectangle);
        colorPane.setPrefSize(300,100);

        ToggleGroup group = new ToggleGroup();

        redButton = new RadioButton("Red");
        redButton.setToggleGroup(group);
        redButton.setOnAction(this::processRadioButtonAction);

        yellowButton = new RadioButton("Yellow");
        yellowButton.setToggleGroup(group);
        yellowButton.setOnAction(this::processRadioButtonAction);

        greenButton = new RadioButton("Green");
        greenButton.setToggleGroup(group);
        greenButton.setOnAction(this::processRadioButtonAction);

        blueButton = new RadioButton("Blue");
        blueButton.setToggleGroup(group);
        blueButton.setOnAction(this::processRadioButtonAction);

        blackButton = new RadioButton("Black");
        blackButton.setSelected(true);
        blackButton.setToggleGroup(group);
        blackButton.setOnAction(this::processRadioButtonAction);

        VBox options = new VBox(redButton, yellowButton, greenButton, blueButton, blackButton);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);

        setSpacing(20);
        getChildren().addAll(options,colorPane);

    }

    private void processRadioButtonAction(javafx.event.ActionEvent actionEvent) {
        if (redButton.isSelected()){
            rectangle.setFill(Color.RED);
        }
        else if(yellowButton.isSelected()){
            rectangle.setFill(Color.YELLOW);
        }
        else if(blueButton.isSelected()){
            rectangle.setFill(Color.BLUE);
        }
        else if(greenButton.isSelected()){
            rectangle.setFill(Color.GREEN);
        }
        else
            rectangle.setFill(Color.BLACK);
    }

}
