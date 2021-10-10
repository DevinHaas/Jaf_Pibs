package jaf.kapitel5.beispiel_radio_buttons;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class QuoteChoosePane extends HBox {

    private final Text quote;
    private final String philosophyQuote;
    private final String carpentryQuote;
    private final String comedQuote;
    private final RadioButton philosophyButton;
    private final RadioButton carpentryButton;
    private final RadioButton comedyButton;

    public QuoteChoosePane()
    {
        philosophyQuote = "blaskdf";
        carpentryQuote = " alöskdjfölasdjf";
        comedQuote = "ide isch scheisse hahah";

        quote = new Text(philosophyQuote);
        quote.setFont(new Font("Helvetica", 24));

        StackPane quotePane = new StackPane(quote);

        quotePane.setPrefSize(300,100);

        ToggleGroup group = new ToggleGroup();

        philosophyButton = new RadioButton("Philosophy");
        philosophyButton.setSelected(true);
        philosophyButton.setToggleGroup(group);
        philosophyButton.setOnAction(this::processRadioButtonAction);

        carpentryButton = new RadioButton("Carpentry");
        carpentryButton.setToggleGroup(group);
        carpentryButton.setOnAction(this::processRadioButtonAction);

        comedyButton = new RadioButton("Comedy");
        comedyButton.setToggleGroup(group);
        comedyButton.setOnAction(this::processRadioButtonAction);

        VBox options = new VBox(philosophyButton, carpentryButton, comedyButton);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);

        setSpacing(20);
        getChildren().addAll(options,quotePane);

    }

    private void processRadioButtonAction(javafx.event.ActionEvent actionEvent) {
        if (philosophyButton.isSelected()){
            quote.setText(philosophyQuote);
        }
        else if(carpentryButton.isSelected()){
            quote.setText(carpentryQuote);
        }
        else
            quote.setText(comedQuote);
    }

}
