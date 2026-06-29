package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnDragDetected<S extends HasOnDragDetected<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onDragDetected(EventHandler<? super MouseEvent> v) {
    node().setOnDragDetected(v);
    return self();
  }

  default S onDragDetected(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onDragDetectedProperty().bind(v);
    return self();
  }

  default S onDragDetectedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onDragDetectedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onDragDetected() {
    return node().getOnDragDetected();
  }
}
