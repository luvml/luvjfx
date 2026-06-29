package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.SwipeEvent;
import luvjfx.FxNodeOps;

public interface HasOnSwipeUp<S extends HasOnSwipeUp<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onSwipeUp(EventHandler<? super SwipeEvent> v) {
    node().setOnSwipeUp(v);
    return self();
  }

  default S onSwipeUp(ObservableValue<? extends EventHandler<? super SwipeEvent>> v) {
    node().onSwipeUpProperty().bind(v);
    return self();
  }

  default S onSwipeUpBidi(Property<EventHandler<? super SwipeEvent>> v) {
    node().onSwipeUpProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super SwipeEvent> onSwipeUp() {
    return node().getOnSwipeUp();
  }
}
