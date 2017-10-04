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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * Created by nhchon on 10/4/2017 8:54 AM.
 */
public class JavaFxFullScreen extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text("!");
        text.setFont(new Font(40));
        VBox box = new VBox();
        box.getChildren().add(text);
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(null);
        stage.setScene(scene);
        stage.show();

        stage.setFullScreen(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
