package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.TouchEvent;
import luvjfx.FxNodeOps;

public interface HasOnTouchPressed<S extends HasOnTouchPressed<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onTouchPressed(EventHandler<? super TouchEvent> v) {
    node().setOnTouchPressed(v);
    return self();
  }

  default S onTouchPressed(ObservableValue<? extends EventHandler<? super TouchEvent>> v) {
    node().onTouchPressedProperty().bind(v);
    return self();
  }

  default S onTouchPressedBidi(Property<EventHandler<? super TouchEvent>> v) {
    node().onTouchPressedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super TouchEvent> onTouchPressed() {
    return node().getOnTouchPressed();
  }
}
