package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FxLayoutPaneExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create the Label for the Name
    Label nameLbl = new Label("Name:");
    // Set the position of the Label
    nameLbl.relocate(10, 10);
    // Create the TextField for the Name
    TextField nameFld = new TextField();
    // Set the position of the TextField
    nameFld.relocate(50, 10);
    // Create the Label for the Password
    Label passwordLbl = new Label("Password:");
    // Set the position of the Label
    passwordLbl.relocate(200, 10);
    // Create the TextField for the Password
    TextField passwordFld = new TextField();
    // Set the position of the TextField
    passwordFld.relocate(260, 10);
    // Create the Login Button
    Button loginBtn = new Button("Login");
    // Set the position of the Button
    loginBtn.relocate(420, 10);

    // Create the Pane
    Pane root = new Pane();

    // Set the background-color of the Pane
    root.setStyle("-fx-background-color: blue, lightgray;");
    // Set the background-insets of the Pane
    root.setStyle("-fx-background-insets: 0, 4;");
    // Set the background-radius of the Pane
    root.setStyle("-fx-background-radius: 4, 2;");

    // Set the size of the Pane
    root.setPrefSize(500, 200);
    // Add the children to the Pane
    root.getChildren().addAll(nameLbl, nameFld, passwordLbl, passwordFld, loginBtn);

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A Pane Example");
    // Display the Stage
    stage.show();
  }
}
