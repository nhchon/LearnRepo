package com.chonnguyen.myfx.zetcode;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/** Blend a coke can and a pepsi can to find the difference. */
public class PepsiChallenge extends Application {
    @Override
    public void start(Stage stage) {
        Image coke = new Image(
                "http://icons.iconarchive.com/icons/michael/coke-pepsi/256/Coca-Cola-Can-icon.png"
        );

        Image pepsi = new Image(
                "http://icons.iconarchive.com/icons/michael/coke-pepsi/256/Pepsi-Can-icon.png"
        );

        ImageView bottom = new ImageView(coke);
        ImageView top = new ImageView(pepsi);
        top.setBlendMode(BlendMode.DIFFERENCE);

        Group blend = new Group(
                bottom,
                top
        );

        HBox layout = new HBox(10);
        layout.getChildren().addAll(
                new ImageView(coke),
                blend,
                new ImageView(pepsi)
        );
        layout.setPadding(new Insets(10));
        stage.setScene(new Scene(layout));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}