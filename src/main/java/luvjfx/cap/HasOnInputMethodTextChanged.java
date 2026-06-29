package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.InputMethodEvent;
import luvjfx.FxNodeOps;

public interface HasOnInputMethodTextChanged<S extends HasOnInputMethodTextChanged<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onInputMethodTextChanged(EventHandler<? super InputMethodEvent> v) {
    node().setOnInputMethodTextChanged(v);
    return self();
  }

  default S onInputMethodTextChanged(
      ObservableValue<? extends EventHandler<? super InputMethodEvent>> v) {
    node().onInputMethodTextChangedProperty().bind(v);
    return self();
  }

  default S onInputMethodTextChangedBidi(Property<EventHandler<? super InputMethodEvent>> v) {
    node().onInputMethodTextChangedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super InputMethodEvent> onInputMethodTextChanged() {
    return node().getOnInputMethodTextChanged();
  }
}
