package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseDragged<S extends HasOnMouseDragged<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseDragged(EventHandler<? super MouseEvent> v) {
    node().setOnMouseDragged(v);
    return self();
  }

  default S onMouseDragged(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseDraggedProperty().bind(v);
    return self();
  }

  default S onMouseDraggedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseDraggedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseDragged() {
    return node().getOnMouseDragged();
  }
}
