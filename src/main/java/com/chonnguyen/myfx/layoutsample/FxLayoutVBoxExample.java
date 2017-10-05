package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxLayoutVBoxExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create the Label for the Name
    Label nameLbl = new Label("Name:");
    // Create the TextField for the Name
    TextField nameFld = new TextField();
    // Create the Label for the Password
    Label passwordLbl = new Label("Password:");
    // Create the TextField for the Password
    TextField passwordFld = new TextField();
    // Create the Login-Button
    Button loginBtn = new Button("Login");

    // Create the VBox with a 10px spacing
    VBox root = new VBox(10);
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
    // Set the size of the VBox
    root.setPrefSize(250, 250);
    // Add the children to the VBox
    root.getChildren().addAll(nameLbl, nameFld, passwordLbl, passwordFld, loginBtn);

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A VBox Example");
    // Display the Stage
    stage.show();
  }
}
