package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragExited<S extends HasOnDragExited<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragExited(EventHandler<? super DragEvent> v) {
    node().setOnDragExited(v);
    return self();
  }

  default S onDragExited(ObservableValue<? extends EventHandler<? super DragEvent>> v) {
    node().onDragExitedProperty().bind(v);
    return self();
  }

  default S onDragExitedBidi(Property<EventHandler<? super DragEvent>> v) {
    node().onDragExitedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super DragEvent> onDragExited() {
    return node().getOnDragExited();
  }
}
