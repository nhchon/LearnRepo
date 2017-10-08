package com.chonnguyen.myfx.zetcode;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Hoverboard extends Application {

    public class TextChooser extends StackPane {
        private Label label = new Label();
        private ComboBox<String> combo = new ComboBox<>();

        public TextChooser(String... options) {
            StackPane.setAlignment(label, Pos.CENTER_LEFT);
            StackPane.setAlignment(combo, Pos.CENTER_LEFT);

            label.textProperty().bind(
                    combo.getSelectionModel().selectedItemProperty()
            );
            label.visibleProperty().bind(
                    combo.visibleProperty().not()
            );
            label.setPadding(new Insets(0, 0, 0, 9));

            combo.getItems().setAll(options);
            combo.getSelectionModel().select(0);
            combo.setVisible(false);

            label.setOnMouseEntered(event -> combo.setVisible(true));
            combo.showingProperty().addListener(observable -> {
                if (!combo.isShowing()) {
                    combo.setVisible(false);
                }
            });
            combo.setOnMouseExited(event -> {
                if (!combo.isShowing()) {
                    combo.setVisible(false);
                }
            });

            getChildren().setAll(label, combo);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextChooser textChooser = new TextChooser(
                "xyzzy", "frobozz", "foobar"
        );

        VBox layout = new VBox(textChooser);
        layout.setPadding(new Insets(10));

        stage.setScene(new Scene(layout));
        stage.show();
    }

    public static void main(String[] args) {
        launch(Hoverboard.class);
    }

}