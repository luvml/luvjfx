package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseDragEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseDragOver<S extends HasOnMouseDragOver<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseDragOver(EventHandler<? super MouseDragEvent> v) {
    node().setOnMouseDragOver(v);
    return self();
  }

  default S onMouseDragOver(ObservableValue<? extends EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragOverProperty().bind(v);
    return self();
  }

  default S onMouseDragOverBidi(Property<EventHandler<? super MouseDragEvent>> v) {
    node().onMouseDragOverProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseDragEvent> onMouseDragOver() {
    return node().getOnMouseDragOver();
  }
}
