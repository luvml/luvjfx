package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasVbarPolicy<S extends HasVbarPolicy<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S vbarPolicy(ScrollPane.ScrollBarPolicy v) {
    node().setVbarPolicy(v);
    return self();
  }

  default S vbarPolicy(ObservableValue<? extends ScrollPane.ScrollBarPolicy> v) {
    node().vbarPolicyProperty().bind(v);
    return self();
  }

  default S vbarPolicyBidi(Property<ScrollPane.ScrollBarPolicy> v) {
    node().vbarPolicyProperty().bindBidirectional(v);
    return self();
  }

  default ScrollPane.ScrollBarPolicy vbarPolicy() {
    return node().getVbarPolicy();
  }
}
