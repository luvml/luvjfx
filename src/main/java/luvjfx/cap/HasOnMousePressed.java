package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMousePressed<S extends HasOnMousePressed<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMousePressed(EventHandler<? super MouseEvent> v) {
    node().setOnMousePressed(v);
    return self();
  }

  default S onMousePressed(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMousePressedProperty().bind(v);
    return self();
  }

  default S onMousePressedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMousePressedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMousePressed() {
    return node().getOnMousePressed();
  }
}
