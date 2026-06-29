package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragOver<S extends HasOnDragOver<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragOver(EventHandler<? super DragEvent> v) {
    node().setOnDragOver(v);
    return self();
  }

  default S onDragOver(ObservableValue<? extends EventHandler<? super DragEvent>> v) {
    node().onDragOverProperty().bind(v);
    return self();
  }

  default S onDragOverBidi(Property<EventHandler<? super DragEvent>> v) {
    node().onDragOverProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super DragEvent> onDragOver() {
    return node().getOnDragOver();
  }
}
