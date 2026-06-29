package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.TouchEvent;
import luvjfx.FxNodeOps;

public interface HasOnTouchReleased<S extends HasOnTouchReleased<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onTouchReleased(EventHandler<? super TouchEvent> v) {
    node().setOnTouchReleased(v);
    return self();
  }

  default S onTouchReleased(ObservableValue<? extends EventHandler<? super TouchEvent>> v) {
    node().onTouchReleasedProperty().bind(v);
    return self();
  }

  default S onTouchReleasedBidi(Property<EventHandler<? super TouchEvent>> v) {
    node().onTouchReleasedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super TouchEvent> onTouchReleased() {
    return node().getOnTouchReleased();
  }
}
