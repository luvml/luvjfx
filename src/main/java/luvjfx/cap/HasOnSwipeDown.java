package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.SwipeEvent;
import luvjfx.FxNodeOps;

public interface HasOnSwipeDown<S extends HasOnSwipeDown<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onSwipeDown(EventHandler<? super SwipeEvent> v) {
    node().setOnSwipeDown(v);
    return self();
  }

  default S onSwipeDown(ObservableValue<? extends EventHandler<? super SwipeEvent>> v) {
    node().onSwipeDownProperty().bind(v);
    return self();
  }

  default S onSwipeDownBidi(Property<EventHandler<? super SwipeEvent>> v) {
    node().onSwipeDownProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super SwipeEvent> onSwipeDown() {
    return node().getOnSwipeDown();
  }
}
