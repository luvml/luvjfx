package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import luvjfx.FxNodeOps;

public interface HasOnActionChoiceBox<S extends HasOnActionChoiceBox<S, N, T>, N extends ChoiceBox<T>, T> extends FxNodeOps<S, N> {
  default S onAction(EventHandler<ActionEvent> v) {
    node().setOnAction(v);
    return self();
  }

  default S onAction(ObservableValue<? extends EventHandler<ActionEvent>> v) {
    node().onActionProperty().bind(v);
    return self();
  }

  default S onActionBidi(Property<EventHandler<ActionEvent>> v) {
    node().onActionProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ActionEvent> onAction() {
    return node().getOnAction();
  }
}
