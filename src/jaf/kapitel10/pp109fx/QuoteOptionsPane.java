package jaf.kapitel10.pp109fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class QuoteOptionsPane extends HBox {
  private Text quote;
  private final String philosophyQuote;
  private final String carpentryQuote;
  private final String comedyQuote;
  private Spinner<String> stringSpinner;

  public QuoteOptionsPane() {
    philosophyQuote = "I think, therefore I am.";
    carpentryQuote = "Measure twice. Cut once.";
    comedyQuote = "Take my wife, please.";

    quote = new Text(philosophyQuote);
    quote.setFont(new Font("Helvetica", 24));

    ObservableList<String> list = FXCollections.observableArrayList();
    list.addAll("I think, therefore I am.", "Measure twice. Cut once.", "Take my wife, please.");
    stringSpinner = new Spinner<>(list);
    stringSpinner.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

    quote.textProperty().bind(stringSpinner.valueProperty());

    StackPane quotePane = new StackPane(quote);
    quotePane.setPrefSize(300, 100);
    VBox options = new VBox(stringSpinner);
    options.setAlignment(Pos.CENTER_LEFT);
    options.setSpacing(10);
    setSpacing(20);
    getChildren().addAll(options, quotePane);
  }
}
