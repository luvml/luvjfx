package luvjfx.demo;

import static luvjfx.Fx.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class DemoApp extends Application {

    @Override public void start(Stage stage) {
        var status = label("Enter: Book    Esc: Quit    Tab: move between fields/buttons")
            .padding(new Insets(6, 10, 6, 10))
            .style("-fx-background-color: #eeeeee; -fx-text-fill: #555555;");

        var name = textField().promptText("Your name");
        var trip = label("Trip type: (none chosen)");
        
        var form = vbox(
            label("Booking").style("-fx-font-size: 18; -fx-font-weight: bold;"),
            label("Name"),
            name,
            label("Trip type"),
            hbox(
                button("Return").onAction(e -> trip.node.setText("Trip type: Return")),
                button("One way").onAction(e -> trip.node.setText("Trip type: One way"))
            ).spacing(8),
            trip,
            button("Book")
                .defaultButton(true)
                .onAction(e -> {
                    var who = name.node.getText().isBlank() ? "(no name)" : name.node.getText();
                    status.node.setText("Booked for " + who + "  —  " + trip.node.getText());
                })
        ).styleClass("form").spacing(8).padding(16);

        var root = borderPane().center(form).bottom(status);

        var scene = scene(root, 440, 380);
        scene.setOnKeyPressed(e -> { if (e.getCode() == KeyCode.ESCAPE) stage.close(); });

        stage.setTitle("luvjfx demo — fluent");
        stage.setScene(scene);
        stage.show();
        name.node.requestFocus();
    }
}
