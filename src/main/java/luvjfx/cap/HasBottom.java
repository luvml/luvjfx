package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import luvjfx.FxNodeOps;

public interface HasBottom<S extends HasBottom<S, N>, N extends BorderPane> extends FxNodeOps<S, N> {
  default S bottom(Node v) {
    node().setBottom(v);
    return self();
  }

  default S bottom(FxNodeOps<?, ? extends Node> v) {
    node().setBottom(v.node());
    return self();
  }

  default S bottom(ObservableValue<? extends Node> v) {
    node().bottomProperty().bind(v);
    return self();
  }

  default S bottomBidi(Property<Node> v) {
    node().bottomProperty().bindBidirectional(v);
    return self();
  }

  default Node bottom() {
    return node().getBottom();
  }
}
