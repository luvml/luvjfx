package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseDragEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseDragExited<S extends HasOnMouseDragExited<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseDragExited(EventHandler<? super MouseDragEvent> v) {
    node().setOnMouseDragExited(v);
    return self();
  }

  default S onMouseDragExited(ObservableValue<? extends EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragExitedProperty().bind(v);
    return self();
  }

  default S onMouseDragExitedBidi(Property<EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragExitedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseDragEvent> onMouseDragExited() {
    return node().getOnMouseDragExited();
  }
}
