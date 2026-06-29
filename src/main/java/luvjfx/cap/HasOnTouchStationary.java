package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.TouchEvent;
import luvjfx.FxNodeOps;

public interface HasOnTouchStationary<S extends HasOnTouchStationary<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onTouchStationary(EventHandler<? super TouchEvent> v) {
    node().setOnTouchStationary(v);
    return self();
  }

  default S onTouchStationary(ObservableValue<? extends EventHandler<? super TouchEvent>> v) {
    node().onTouchStationaryProperty().bind(v);
    return self();
  }

  default S onTouchStationaryBidi(Property<EventHandler<? super TouchEvent>> v) {
    node().onTouchStationaryProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super TouchEvent> onTouchStationary() {
    return node().getOnTouchStationary();
  }
}
