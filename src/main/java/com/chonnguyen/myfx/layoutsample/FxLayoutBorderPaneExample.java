package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FxLayoutBorderPaneExample extends Application {
  // Create the TextField for the input
  private TextField inputArea = new TextField();
  // Create the TextArea for the Output
  private TextArea outputArea = new TextArea();

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create the Label for the Header
    Label headerLbl = new Label("Please insert your Message in the TextArea!");
    // Create the Label for the Input
    Label inputLbl = new Label("Input: ");
    // Create the OK-Button
    Button okBtn = new Button("OK");

    // add an EventHandler to the OK-Button
    okBtn.setOnAction(
        new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
            writeOutput(inputArea.getText());
          }
        });

    // Create the BorderPane
    BorderPane root = new BorderPane();
    // Store the Header Label in the Top Region
    root.setTop(headerLbl);
    // Store the OK Button in the Top Region
    root.setRight(okBtn);
    // Store the Output Area in the Right Region
    root.setBottom(outputArea);
    // Store the Input Label in the Bottom Region
    root.setLeft(inputLbl);
    // Store the Input Area in the Center Region
    root.setCenter(inputArea);

    // Set the alignment of the Header Label to bottom center
    BorderPane.setAlignment(headerLbl, Pos.BOTTOM_CENTER);
    // Set the alignment of the Input Label to center left
    BorderPane.setAlignment(inputLbl, Pos.CENTER_LEFT);
    // Set the alignment of the OK Button to center right
    BorderPane.setAlignment(okBtn, Pos.CENTER_RIGHT);

    // Set the padding of the VBox
    root.setStyle("-fx-padding: 10;");
    // Set the border-style of the VBox
    root.setStyle("-fx-border-style: solid inside;");
    // Set the border-width of the VBox
    root.setStyle("-fx-border-width: 2;");
    // Set the border-insets of the VBox
    root.setStyle("-fx-border-insets: 5;");
    // Set the border-radius of the VBox
    root.setStyle("-fx-border-radius: 5;");
    // Set the border-color of the VBox
    root.setStyle("-fx-border-color: blue;");

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A BorderPane Example");
    // Display the Stage
    stage.show();
  }

  // Method to log the Message to the Output-Area
  private void writeOutput(String msg) {
    this.outputArea.appendText("Your Input: " + msg + "\n");
  }
}
