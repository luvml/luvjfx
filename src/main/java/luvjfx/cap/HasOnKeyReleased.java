package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import luvjfx.FxNodeOps;

public interface HasOnKeyReleased<S extends HasOnKeyReleased<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onKeyReleased(EventHandler<? super KeyEvent> v) {
    node().setOnKeyReleased(v);
    return self();
  }

  default S onKeyReleased(ObservableValue<? extends EventHandler<? super KeyEvent>> v) {
    node().onKeyReleasedProperty().bind(v);
    return self();
  }

  default S onKeyReleasedBidi(Property<EventHandler<? super KeyEvent>> v) {
    node().onKeyReleasedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super KeyEvent> onKeyReleased() {
    return node().getOnKeyReleased();
  }
}
