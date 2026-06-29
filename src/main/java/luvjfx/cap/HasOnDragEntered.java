package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragEntered<S extends HasOnDragEntered<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragEntered(EventHandler<? super DragEvent> v) {
    node().setOnDragEntered(v);
    return self();
  }

  default S onDragEntered(ObservableValue<? extends EventHandler<? super DragEvent>> v) {
    node().onDragEnteredProperty().bind(v);
    return self();
  }

  default S onDragEnteredBidi(Property<EventHandler<? super DragEvent>> v) {
    node().onDragEnteredProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super DragEvent> onDragEntered() {
    return node().getOnDragEntered();
  }
}
