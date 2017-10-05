package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FxLayoutStackPaneExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create a Rectangle with Width 200 and Height 100
    Rectangle rect = new Rectangle(200, 100);
    // Set the color of the Rectangle to Lavendar
    rect.setFill(Color.LAVENDER);
    // Create the Text
    Text text = new Text("A Text inside a Rectangle");

    // Create the StackPane
    StackPane root = new StackPane();
    // Add the children to the StackPane
    root.getChildren().addAll(rect, text);
    // Set the Alignment of the Children to top center
    root.setAlignment(Pos.TOP_CENTER);
    // Set the size of the StackPane
    root.setPrefSize(300, 200);
    // Set the padding of the StackPane
    root.setStyle("-fx-padding: 10;");
    // Set the border-style of the StackPane
    root.setStyle("-fx-border-style: solid inside;");
    // Set the border-width of the StackPane
    root.setStyle("-fx-border-width: 2;");
    // Set the border-insets of the StackPane
    root.setStyle("-fx-border-insets: 5;");
    // Set the border-radius of the StackPane
    root.setStyle("-fx-border-radius: 5;");
    // Set the border-color of the StackPane
    root.setStyle("-fx-border-color: blue;");

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A StackPane Example");
    // Display the Stage
    stage.show();
  }
}
