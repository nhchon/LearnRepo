/*************************************************************************
 *  Copyright (c) Metabiota Incorporated - All Rights Reserved
 *------------------------------------------------------------------------
 *  This material is proprietary to Metabiota Incorporated. The
 *  intellectual and technical concepts contained herein are proprietary
 *  to Metabiota Incorporated. Reproduction or distribution of this
 *  material, in whole or in part, is strictly forbidden unless prior
 *  written permission is obtained from Metabiota Incorporated.
 *************************************************************************/
package com.chonnguyen.myfx.hello;

/**
 * Created by nhchon on 10/11/2017 4:35 PM.
 */
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ImageResizer extends Application {
    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar=new MenuBar();
        Menu menuGame = new Menu("Game");
        MenuItem newGame = new MenuItem("New Game                F1");
        MenuItem exit = new MenuItem("Exit                            F2");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        menuGame.getItems().addAll(newGame,new SeparatorMenuItem(),exit);
        menuBar.getMenus().addAll(menuGame);

        Image image = new Image("https://static.pexels.com/photos/20974/pexels-photo.jpg");
        ImageView imageView = new ImageView();
        imageView.setImage(image);

        ImageViewPane viewPane = new ImageViewPane(imageView);

        VBox vbox=new VBox();
        StackPane root=new StackPane();
        root.getChildren().addAll(viewPane);

        vbox.getChildren().addAll(menuBar,root);
        VBox.setVgrow(root, Priority.ALWAYS);

        Scene scene= new Scene(vbox,200,200);
        primaryStage.setScene(scene);

//        primaryStage.setMaxHeight(400);
//        primaryStage.setMinHeight(200);
//        primaryStage.setMaxWidth(500);
//        primaryStage.setMinWidth(400);

        primaryStage.setTitle("Minesweeper");
        primaryStage.show();

    }
    public static void main(String[] args) { launch(); }
}


