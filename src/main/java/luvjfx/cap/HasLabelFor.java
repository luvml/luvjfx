package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.Label;
import luvjfx.FxNodeOps;

public interface HasLabelFor<S extends HasLabelFor<S, N>, N extends Label> extends FxNodeOps<S, N> {
  default S labelFor(Node v) {
    node().setLabelFor(v);
    return self();
  }

  default S labelFor(FxNodeOps<?, ? extends Node> v) {
    node().setLabelFor(v.node());
    return self();
  }

  default S labelFor(ObservableValue<? extends Node> v) {
    node().labelForProperty().bind(v);
    return self();
  }

  default S labelForBidi(Property<Node> v) {
    node().labelForProperty().bindBidirectional(v);
    return self();
  }

  default Node labelFor() {
    return node().getLabelFor();
  }
}
