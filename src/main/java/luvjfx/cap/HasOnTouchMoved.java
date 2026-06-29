package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.TouchEvent;
import luvjfx.FxNodeOps;

public interface HasOnTouchMoved<S extends HasOnTouchMoved<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onTouchMoved(EventHandler<? super TouchEvent> v) {
    node().setOnTouchMoved(v);
    return self();
  }

  default S onTouchMoved(ObservableValue<? extends EventHandler<? super TouchEvent>> v) {
    node().onTouchMovedProperty().bind(v);
    return self();
  }

  default S onTouchMovedBidi(Property<EventHandler<? super TouchEvent>> v) {
    node().onTouchMovedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super TouchEvent> onTouchMoved() {
    return node().getOnTouchMoved();
  }
}
