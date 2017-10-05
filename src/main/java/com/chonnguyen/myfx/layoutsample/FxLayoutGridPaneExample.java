package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FxLayoutGridPaneExample extends Application {
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

    // Create the GridPane
    GridPane root = new GridPane();
    // Add the Name Label at column 0 and row 0
    root.add(nameLbl, 0, 0);
    // Add the Name Field at column 1 and row 0
    root.add(nameFld, 1, 0);
    // Add the Password Label at column 0 and row 1
    root.add(passwordLbl, 0, 1);
    // Add the Password Field at column 1 and row 1
    root.add(passwordFld, 1, 1);
    // Add the Login Button at column 0 and row 2
    root.add(loginBtn, 0, 2);

    // Set the padding of the GridPane
    root.setStyle("-fx-padding: 10;");
    // Set the border-style of the GridPane
    root.setStyle("-fx-border-style: solid inside;");
    // Set the border-width of the GridPane
    root.setStyle("-fx-border-width: 2;");
    // Set the border-insets of the GridPane
    root.setStyle("-fx-border-insets: 5;");
    // Set the border-radius of the GridPane
    root.setStyle("-fx-border-radius: 5;");
    // Set the border-color of the GridPane
    root.setStyle("-fx-border-color: blue;");
    // Set the size of the GridPane
    root.setPrefSize(250, 250);

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A GridPane Example");
    // Display the Stage
    stage.show();
  }
}
