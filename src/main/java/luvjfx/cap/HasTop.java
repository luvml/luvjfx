package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import luvjfx.FxNodeOps;

public interface HasTop<S extends HasTop<S, N>, N extends BorderPane> extends FxNodeOps<S, N> {
  default S top(Node v) {
    node().setTop(v);
    return self();
  }

  default S top(FxNodeOps<?, ? extends Node> v) {
    node().setTop(v.node());
    return self();
  }

  default S top(ObservableValue<? extends Node> v) {
    node().topProperty().bind(v);
    return self();
  }

  default S topBidi(Property<Node> v) {
    node().topProperty().bindBidirectional(v);
    return self();
  }

  default Node top() {
    return node().getTop();
  }
}
