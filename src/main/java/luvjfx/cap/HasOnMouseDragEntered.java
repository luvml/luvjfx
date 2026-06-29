package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseDragEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseDragEntered<S extends HasOnMouseDragEntered<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseDragEntered(EventHandler<? super MouseDragEvent> v) {
    node().setOnMouseDragEntered(v);
    return self();
  }

  default S onMouseDragEntered(ObservableValue<? extends EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragEnteredProperty().bind(v);
    return self();
  }

  default S onMouseDragEnteredBidi(Property<EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragEnteredProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseDragEvent> onMouseDragEntered() {
    return node().getOnMouseDragEntered();
  }
}
