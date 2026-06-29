package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventDispatcher;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasEventDispatcher<S extends HasEventDispatcher<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S eventDispatcher(EventDispatcher v) {
    node().setEventDispatcher(v);
    return self();
  }

  default S eventDispatcher(ObservableValue<? extends EventDispatcher> v) {
    node().eventDispatcherProperty().bind(v);
    return self();
  }

  default S eventDispatcherBidi(Property<EventDispatcher> v) {
    node().eventDispatcherProperty().bindBidirectional(v);
    return self();
  }

  default EventDispatcher eventDispatcher() {
    return node().getEventDispatcher();
  }
}
