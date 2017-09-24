package com.chonnguyen.myfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * File Name: ImageViewer.java
 **
 @author Shufen Kuo
 */
public class ImageViewer extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane rootPane = new BorderPane();
        StackPane imageArea = new StackPane();
        rootPane.getChildren().add(imageArea);
        Scene scene = new Scene(rootPane, 600, 400);
        stage.setTitle("ImageViewer V1.0");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}