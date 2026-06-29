package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import luvjfx.FxNodeOps;

public interface HasRight<S extends HasRight<S, N>, N extends BorderPane> extends FxNodeOps<S, N> {
  default S right(Node v) {
    node().setRight(v);
    return self();
  }

  default S right(FxNodeOps<?, ? extends Node> v) {
    node().setRight(v.node());
    return self();
  }

  default S right(ObservableValue<? extends Node> v) {
    node().rightProperty().bind(v);
    return self();
  }

  default S rightBidi(Property<Node> v) {
    node().rightProperty().bindBidirectional(v);
    return self();
  }

  default Node right() {
    return node().getRight();
  }
}
