package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasHbarPolicy<S extends HasHbarPolicy<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S hbarPolicy(ScrollPane.ScrollBarPolicy v) {
    node().setHbarPolicy(v);
    return self();
  }

  default S hbarPolicy(ObservableValue<? extends ScrollPane.ScrollBarPolicy> v) {
    node().hbarPolicyProperty().bind(v);
    return self();
  }

  default S hbarPolicyBidi(Property<ScrollPane.ScrollBarPolicy> v) {
    node().hbarPolicyProperty().bindBidirectional(v);
    return self();
  }

  default ScrollPane.ScrollBarPolicy hbarPolicy() {
    return node().getHbarPolicy();
  }
}
