package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.input.InputMethodRequests;
import luvjfx.FxNodeOps;

public interface HasInputMethodRequests<S extends HasInputMethodRequests<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S inputMethodRequests(InputMethodRequests v) {
    node().setInputMethodRequests(v);
    return self();
  }

  default S inputMethodRequests(ObservableValue<? extends InputMethodRequests> v) {
    node().inputMethodRequestsProperty().bind(v);
    return self();
  }

  default S inputMethodRequestsBidi(Property<InputMethodRequests> v) {
    node().inputMethodRequestsProperty().bindBidirectional(v);
    return self();
  }

  default InputMethodRequests inputMethodRequests() {
    return node().getInputMethodRequests();
  }
}
