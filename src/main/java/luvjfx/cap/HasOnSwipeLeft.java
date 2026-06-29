package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.SwipeEvent;
import luvjfx.FxNodeOps;

public interface HasOnSwipeLeft<S extends HasOnSwipeLeft<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onSwipeLeft(EventHandler<? super SwipeEvent> v) {
    node().setOnSwipeLeft(v);
    return self();
  }

  default S onSwipeLeft(ObservableValue<? extends EventHandler<? super SwipeEvent>> v) {
    node().onSwipeLeftProperty().bind(v);
    return self();
  }

  default S onSwipeLeftBidi(Property<EventHandler<? super SwipeEvent>> v) {
    node().onSwipeLeftProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super SwipeEvent> onSwipeLeft() {
    return node().getOnSwipeLeft();
  }
}
