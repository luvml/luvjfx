package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import luvjfx.FxNodeOps;

public interface HasOnKeyTyped<S extends HasOnKeyTyped<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onKeyTyped(EventHandler<? super KeyEvent> v) {
    node().setOnKeyTyped(v);
    return self();
  }

  default S onKeyTyped(ObservableValue<? extends EventHandler<? super KeyEvent>> v) {
    node().onKeyTypedProperty().bind(v);
    return self();
  }

  default S onKeyTypedBidi(Property<EventHandler<? super KeyEvent>> v) {
    node().onKeyTypedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super KeyEvent> onKeyTyped() {
    return node().getOnKeyTyped();
  }
}
