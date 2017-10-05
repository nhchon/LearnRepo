package com.chonnguyen.myfx.layoutsample;

import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import javafx.stage.Stage;

public class FxLayoutGroupExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create the Label for the Name
    Label nameLbl = new Label("Name:");
    // Set the location for the Label
    nameLbl.setLayoutX(10);
    nameLbl.setLayoutY(10);

    // Create the TextField for the Name
    TextField nameFld = new TextField();

    // Set the location of the Name TextField relative to the Name Label
    NumberBinding nameFldXBinding = nameLbl.layoutXProperty().add(nameLbl.widthProperty().add(10));
    nameFld.layoutXProperty().bind(nameFldXBinding);
    nameFld.layoutYProperty().bind(nameLbl.layoutYProperty());

    // Create the Label for the Password
    Label passwordLbl = new Label("Password:");

    // Set the location of the Password Label relative to the Name TextField
    NumberBinding passwordLblXBinding =
        nameFld.layoutXProperty().add(nameFld.widthProperty().add(10));
    passwordLbl.layoutXProperty().bind(passwordLblXBinding);
    passwordLbl.layoutYProperty().bind(nameFld.layoutYProperty());

    // Create the TextField for the Password
    TextField passwordFld = new TextField();

    // Set the location of the Password TextField relative to the Password Label
    NumberBinding passwordFldXBinding =
        passwordLbl.layoutXProperty().add(passwordLbl.widthProperty().add(10));
    passwordFld.layoutXProperty().bind(passwordFldXBinding);
    passwordFld.layoutYProperty().bind(passwordLbl.layoutYProperty());

    // Create the Login-Button
    Button loginBtn = new Button("Login");

    // Set the location of the Login Button relative to the Password TextField
    NumberBinding loginBtnXBinding =
        passwordFld.layoutXProperty().add(passwordFld.widthProperty().add(10));
    loginBtn.layoutXProperty().bind(loginBtnXBinding);
    loginBtn.layoutYProperty().bind(passwordFld.layoutYProperty());

    // Create the Group
    Group root = new Group();
    // Add the children to the Group
    root.getChildren().addAll(nameLbl, nameFld, passwordLbl, passwordFld, loginBtn);

    // Create the Scene
    Scene scene = new Scene(root);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A Group Example");
    // Display the Stage
    stage.show();
  }
}
