package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragDone<S extends HasOnDragDone<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragDone(EventHandler<? super DragEvent> v) {
    node().setOnDragDone(v);
    return self();
  }

  default S onDragDone(ObservableValue<? extends EventHandler<? super DragEvent>> v) {
    node().onDragDoneProperty().bind(v);
    return self();
  }

  default S onDragDoneBidi(Property<EventHandler<? super DragEvent>> v) {
    node().onDragDoneProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super DragEvent> onDragDone() {
    return node().getOnDragDone();
  }
}
