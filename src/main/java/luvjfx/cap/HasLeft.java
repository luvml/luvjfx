package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import luvjfx.FxNodeOps;

public interface HasLeft<S extends HasLeft<S, N>, N extends BorderPane> extends FxNodeOps<S, N> {
  default S left(Node v) {
    node().setLeft(v);
    return self();
  }

  default S left(FxNodeOps<?, ? extends Node> v) {
    node().setLeft(v.node());
    return self();
  }

  default S left(ObservableValue<? extends Node> v) {
    node().leftProperty().bind(v);
    return self();
  }

  default S leftBidi(Property<Node> v) {
    node().leftProperty().bindBidirectional(v);
    return self();
  }

  default Node left() {
    return node().getLeft();
  }
}
