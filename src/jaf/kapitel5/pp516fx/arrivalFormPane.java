package jaf.kapitel5.pp516fx;


import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class arrivalFormPane extends HBox {

    private final Text text1;
    private final Text text2;
    private final Text text3;
    private final Text text4;
    private final Text text5;
    private final Text textTotal;
    private final CheckBox item1;
    private final CheckBox item2;
    private final CheckBox item3;
    private final CheckBox item4;
    private final CheckBox item5;
    private final TextField value1;
    private final TextField value2;
    private final TextField value3;
    private final TextField value4;
    private final TextField value5;
    private final Label total;


    public arrivalFormPane()
    {


        Font font = new Font("Helvetica", 20);

        item1 = new CheckBox("Electrical Devices");
        item1.setFont(font);
        text1 = new Text("Do you have any Electrical Devices ?");
        text1.setFont(font);
        value1 = new TextField();
        value1.setOnAction(this::processTotalValue);



        item2 = new CheckBox("Cheese");
        item2.setFont(font);
        text2 = new Text("Do you have any cheese? ");
        text2.setFont(font);
        value2 = new TextField();
        value2.setOnAction(this::processTotalValue);


        item3 = new CheckBox("Liquids");
        item3.setFont(font);
        text3 = new Text("Do you have any Liquids? ");
        text3.setFont(font);
        value3 = new TextField();
        value3.setOnAction(this::processTotalValue);


        item4 = new CheckBox("Drogues");
        item4.setFont(font);
        text4 = new Text("Do you have any Dorgues ? ");
        text4.setFont(font);
        value4 = new TextField();
        value4.setOnAction(this::processTotalValue);


        item5 = new CheckBox("Clothes");
        item5.setFont(font);
        text5 = new Text("Do you have any Clothes ? ");
        text5.setFont(font);
        value5 = new TextField();
        value5.setOnAction(this::processTotalValue);


        textTotal = new Text("Total Value: ");
        total = new Label("---");




        VBox items = new VBox(item1, item2, item3, item4, item5);
        items.setSpacing(30);
        items.setAlignment(Pos.CENTER_LEFT);

        VBox texts = new VBox(text1, text2, text3, text4 ,text5);
        texts.setSpacing(30);
        texts.setAlignment(Pos.CENTER);


        VBox values = new VBox(value1, value2,value3, value4, value5);
        values.setSpacing(30);
        values.setAlignment(Pos.CENTER_RIGHT);
        values.setMaxSize(50,50);

        VBox totalPane = new VBox(textTotal, total);
        totalPane.setAlignment(Pos.CENTER);
        totalPane.setPadding(new Insets(10));


        setSpacing(20);
        getChildren().addAll(items,texts, values, totalPane);




    }

    public void processTotalValue(ActionEvent event){

        Integer totalNumber = Integer.valueOf(value1.getText() + value2.getText() + value3.getText() + value4.getText()
                + value5.getText());

        total.setText(String.valueOf(totalNumber));


    }


}
