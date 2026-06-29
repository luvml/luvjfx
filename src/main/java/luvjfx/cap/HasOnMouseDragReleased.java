package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseDragEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseDragReleased<S extends HasOnMouseDragReleased<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseDragReleased(EventHandler<? super MouseDragEvent> v) {
    node().setOnMouseDragReleased(v);
    return self();
  }

  default S onMouseDragReleased(ObservableValue<? extends EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragReleasedProperty().bind(v);
    return self();
  }

  default S onMouseDragReleasedBidi(Property<EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragReleasedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseDragEvent> onMouseDragReleased() {
    return node().getOnMouseDragReleased();
  }
}
