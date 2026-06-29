package luvjfx.demo;

import static luvjfx.Fx.*;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class DemoApp3 extends Application {

    @Override public void start(Stage stage) {
        var nameModel = new SimpleStringProperty("");

        var name = textField()
            .promptText("Your name")
            .attr(t -> t.textProperty().bindBidirectional(nameModel));

        var greeting = label("")
            .attr(l -> l.textProperty().bind(nameModel.map(n -> n.isBlank() ? "—" : "Hi, " + n)));

        var count = label("")
            .attr(l -> l.textProperty().bind(nameModel.map(n -> n.length() + " chars")));

        var book = button("Book")
            .defaultButton(true)
            .attr(b -> b.disableProperty().bind(nameModel.isEmpty()));

        var form = vbox().styleClass("form").spacing(8).padding(16).nodes(
            label("Reactive — type a name (no int4)").style("-fx-font-size: 16; -fx-font-weight: bold;"),
            name,
            greeting,
            count,
            book
        );

        var scene = scene(form, 360, 240);
        scene.setOnKeyPressed(e -> { if (e.getCode() == KeyCode.ESCAPE) stage.close(); });
        stage.setTitle("luvjfx demo — vanilla reactivity");
        stage.setScene(scene);
        stage.show();
        name.node.requestFocus();
    }
}
