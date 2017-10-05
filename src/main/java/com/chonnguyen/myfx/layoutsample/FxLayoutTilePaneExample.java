package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class FxLayoutTilePaneExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Set the hgap property to 10 pixels
    double hgap = 10;
    // Set the vgap property to 10 pixels
    double vgap = 10;

    // Create the horizontal TilePane with a 10px spacing
    TilePane root = new TilePane(Orientation.HORIZONTAL, hgap, vgap);
    // Set the preferred number of columns
    root.setPrefColumns(5);

    // Add the children (ten buttons) to the TilePane
    for (int i = 1; i <= 10; i++) {
      root.getChildren().add(new Button("Button " + i));
    }

    // Set the padding of the TilePane
    root.setStyle("-fx-padding: 10;");
    // Set the border-style of the TilePane
    root.setStyle("-fx-border-style: solid inside;");
    // Set the border-width of the TilePane
    root.setStyle("-fx-border-width: 2;");
    // Set the border-insets of the TilePane
    root.setStyle("-fx-border-insets: 5;");
    // Set the border-radius of the TilePane
    root.setStyle("-fx-border-radius: 5;");
    // Set the border-color of the TilePane
    root.setStyle("-fx-border-color: blue;");

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A TilePane Example");
    // Display the Stage
    stage.show();
  }
}
