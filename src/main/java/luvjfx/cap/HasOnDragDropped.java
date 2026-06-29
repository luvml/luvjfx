package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragDropped<S extends HasOnDragDropped<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragDropped(EventHandler<? super DragEvent> v) {
    node().setOnDragDropped(v);
    return self();
  }

  default S onDragDropped(ObservableValue<? extends EventHandler<? super DragEvent>> v) {
    node().onDragDroppedProperty().bind(v);
    return self();
  }

  default S onDragDroppedBidi(Property<EventHandler<? super DragEvent>> v) {
    node().onDragDroppedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super DragEvent> onDragDropped() {
    return node().getOnDragDropped();
  }
}
