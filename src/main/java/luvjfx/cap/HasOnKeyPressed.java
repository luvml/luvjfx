package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import luvjfx.FxNodeOps;

public interface HasOnKeyPressed<S extends HasOnKeyPressed<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onKeyPressed(EventHandler<? super KeyEvent> v) {
    node().setOnKeyPressed(v);
    return self();
  }

  default S onKeyPressed(ObservableValue<? extends EventHandler<? super KeyEvent>> v) {
    node().onKeyPressedProperty().bind(v);
    return self();
  }

  default S onKeyPressedBidi(Property<EventHandler<? super KeyEvent>> v) {
    node().onKeyPressedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super KeyEvent> onKeyPressed() {
    return node().getOnKeyPressed();
  }
}
