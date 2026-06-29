package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.SwipeEvent;
import luvjfx.FxNodeOps;

public interface HasOnSwipeRight<S extends HasOnSwipeRight<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onSwipeRight(EventHandler<? super SwipeEvent> v) {
    node().setOnSwipeRight(v);
    return self();
  }

  default S onSwipeRight(ObservableValue<? extends EventHandler<? super SwipeEvent>> v) {
    node().onSwipeRightProperty().bind(v);
    return self();
  }

  default S onSwipeRightBidi(Property<EventHandler<? super SwipeEvent>> v) {
    node().onSwipeRightProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super SwipeEvent> onSwipeRight() {
    return node().getOnSwipeRight();
  }
}
