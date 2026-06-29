package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseMoved<S extends HasOnMouseMoved<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseMoved(EventHandler<? super MouseEvent> v) {
    node().setOnMouseMoved(v);
    return self();
  }

  default S onMouseMoved(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseMovedProperty().bind(v);
    return self();
  }

  default S onMouseMovedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseMovedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseMoved() {
    return node().getOnMouseMoved();
  }
}
